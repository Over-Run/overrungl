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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFloatControlsPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFloatControlsPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkShaderFloatControlsIndependence denormBehaviorIndependence;
///     (int) VkShaderFloatControlsIndependence roundingModeIndependence;
///     (uint32_t) VkBool32 shaderSignedZeroInfNanPreserveFloat16;
///     (uint32_t) VkBool32 shaderSignedZeroInfNanPreserveFloat32;
///     (uint32_t) VkBool32 shaderSignedZeroInfNanPreserveFloat64;
///     (uint32_t) VkBool32 shaderDenormPreserveFloat16;
///     (uint32_t) VkBool32 shaderDenormPreserveFloat32;
///     (uint32_t) VkBool32 shaderDenormPreserveFloat64;
///     (uint32_t) VkBool32 shaderDenormFlushToZeroFloat16;
///     (uint32_t) VkBool32 shaderDenormFlushToZeroFloat32;
///     (uint32_t) VkBool32 shaderDenormFlushToZeroFloat64;
///     (uint32_t) VkBool32 shaderRoundingModeRTEFloat16;
///     (uint32_t) VkBool32 shaderRoundingModeRTEFloat32;
///     (uint32_t) VkBool32 shaderRoundingModeRTEFloat64;
///     (uint32_t) VkBool32 shaderRoundingModeRTZFloat16;
///     (uint32_t) VkBool32 shaderRoundingModeRTZFloat32;
///     (uint32_t) VkBool32 shaderRoundingModeRTZFloat64;
/// };
/// ```
public final class VkPhysicalDeviceFloatControlsPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFloatControlsPropertiesKHR`.
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
    /// The byte offset of `denormBehaviorIndependence`.
    public static final long OFFSET_denormBehaviorIndependence = LAYOUT.byteOffset(PathElement.groupElement("denormBehaviorIndependence"));
    /// The memory layout of `denormBehaviorIndependence`.
    public static final MemoryLayout LAYOUT_denormBehaviorIndependence = LAYOUT.select(PathElement.groupElement("denormBehaviorIndependence"));
    /// The [VarHandle] of `denormBehaviorIndependence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_denormBehaviorIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("denormBehaviorIndependence"));
    /// The byte offset of `roundingModeIndependence`.
    public static final long OFFSET_roundingModeIndependence = LAYOUT.byteOffset(PathElement.groupElement("roundingModeIndependence"));
    /// The memory layout of `roundingModeIndependence`.
    public static final MemoryLayout LAYOUT_roundingModeIndependence = LAYOUT.select(PathElement.groupElement("roundingModeIndependence"));
    /// The [VarHandle] of `roundingModeIndependence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_roundingModeIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("roundingModeIndependence"));
    /// The byte offset of `shaderSignedZeroInfNanPreserveFloat16`.
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The memory layout of `shaderSignedZeroInfNanPreserveFloat16`.
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    /// The byte offset of `shaderSignedZeroInfNanPreserveFloat32`.
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The memory layout of `shaderSignedZeroInfNanPreserveFloat32`.
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    /// The byte offset of `shaderSignedZeroInfNanPreserveFloat64`.
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The memory layout of `shaderSignedZeroInfNanPreserveFloat64`.
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The [VarHandle] of `shaderSignedZeroInfNanPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    /// The byte offset of `shaderDenormPreserveFloat16`.
    public static final long OFFSET_shaderDenormPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The memory layout of `shaderDenormPreserveFloat16`.
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The [VarHandle] of `shaderDenormPreserveFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
    /// The byte offset of `shaderDenormPreserveFloat32`.
    public static final long OFFSET_shaderDenormPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The memory layout of `shaderDenormPreserveFloat32`.
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The [VarHandle] of `shaderDenormPreserveFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
    /// The byte offset of `shaderDenormPreserveFloat64`.
    public static final long OFFSET_shaderDenormPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The memory layout of `shaderDenormPreserveFloat64`.
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The [VarHandle] of `shaderDenormPreserveFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
    /// The byte offset of `shaderDenormFlushToZeroFloat16`.
    public static final long OFFSET_shaderDenormFlushToZeroFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The memory layout of `shaderDenormFlushToZeroFloat16`.
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    /// The byte offset of `shaderDenormFlushToZeroFloat32`.
    public static final long OFFSET_shaderDenormFlushToZeroFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The memory layout of `shaderDenormFlushToZeroFloat32`.
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    /// The byte offset of `shaderDenormFlushToZeroFloat64`.
    public static final long OFFSET_shaderDenormFlushToZeroFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The memory layout of `shaderDenormFlushToZeroFloat64`.
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The [VarHandle] of `shaderDenormFlushToZeroFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDenormFlushToZeroFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    /// The byte offset of `shaderRoundingModeRTEFloat16`.
    public static final long OFFSET_shaderRoundingModeRTEFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The memory layout of `shaderRoundingModeRTEFloat16`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    /// The byte offset of `shaderRoundingModeRTEFloat32`.
    public static final long OFFSET_shaderRoundingModeRTEFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The memory layout of `shaderRoundingModeRTEFloat32`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    /// The byte offset of `shaderRoundingModeRTEFloat64`.
    public static final long OFFSET_shaderRoundingModeRTEFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The memory layout of `shaderRoundingModeRTEFloat64`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTEFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTEFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    /// The byte offset of `shaderRoundingModeRTZFloat16`.
    public static final long OFFSET_shaderRoundingModeRTZFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The memory layout of `shaderRoundingModeRTZFloat16`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    /// The byte offset of `shaderRoundingModeRTZFloat32`.
    public static final long OFFSET_shaderRoundingModeRTZFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The memory layout of `shaderRoundingModeRTZFloat32`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat32` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    /// The byte offset of `shaderRoundingModeRTZFloat64`.
    public static final long OFFSET_shaderRoundingModeRTZFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    /// The memory layout of `shaderRoundingModeRTZFloat64`.
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    /// The [VarHandle] of `shaderRoundingModeRTZFloat64` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRoundingModeRTZFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));

    /// Creates `VkPhysicalDeviceFloatControlsPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFloatControlsPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFloatControlsPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFloatControlsPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFloatControlsPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFloatControlsPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFloatControlsPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFloatControlsPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFloatControlsPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFloatControlsPropertiesKHR`
    public static VkPhysicalDeviceFloatControlsPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFloatControlsPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFloatControlsPropertiesKHR`
    public static VkPhysicalDeviceFloatControlsPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR copyFrom(VkPhysicalDeviceFloatControlsPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFloatControlsPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFloatControlsPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFloatControlsPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `denormBehaviorIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int denormBehaviorIndependence(MemorySegment segment, long index) { return (int) VH_denormBehaviorIndependence.get(segment, 0L, index); }
    /// {@return `denormBehaviorIndependence`}
    public int denormBehaviorIndependence() { return denormBehaviorIndependence(this.segment(), 0L); }
    /// Sets `denormBehaviorIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void denormBehaviorIndependence(MemorySegment segment, long index, int value) { VH_denormBehaviorIndependence.set(segment, 0L, index, value); }
    /// Sets `denormBehaviorIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR denormBehaviorIndependence(int value) { denormBehaviorIndependence(this.segment(), 0L, value); return this; }

    /// {@return `roundingModeIndependence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int roundingModeIndependence(MemorySegment segment, long index) { return (int) VH_roundingModeIndependence.get(segment, 0L, index); }
    /// {@return `roundingModeIndependence`}
    public int roundingModeIndependence() { return roundingModeIndependence(this.segment(), 0L); }
    /// Sets `roundingModeIndependence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void roundingModeIndependence(MemorySegment segment, long index, int value) { VH_roundingModeIndependence.set(segment, 0L, index, value); }
    /// Sets `roundingModeIndependence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR roundingModeIndependence(int value) { roundingModeIndependence(this.segment(), 0L, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat16`}
    public int shaderSignedZeroInfNanPreserveFloat16() { return shaderSignedZeroInfNanPreserveFloat16(this.segment(), 0L); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSignedZeroInfNanPreserveFloat16(MemorySegment segment, long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat16(int value) { shaderSignedZeroInfNanPreserveFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat32`}
    public int shaderSignedZeroInfNanPreserveFloat32() { return shaderSignedZeroInfNanPreserveFloat32(this.segment(), 0L); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSignedZeroInfNanPreserveFloat32(MemorySegment segment, long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat32(int value) { shaderSignedZeroInfNanPreserveFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderSignedZeroInfNanPreserveFloat64`}
    public int shaderSignedZeroInfNanPreserveFloat64() { return shaderSignedZeroInfNanPreserveFloat64(this.segment(), 0L); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSignedZeroInfNanPreserveFloat64(MemorySegment segment, long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat64(int value) { shaderSignedZeroInfNanPreserveFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormPreserveFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormPreserveFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat16`}
    public int shaderDenormPreserveFloat16() { return shaderDenormPreserveFloat16(this.segment(), 0L); }
    /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormPreserveFloat16(MemorySegment segment, long index, int value) { VH_shaderDenormPreserveFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat16(int value) { shaderDenormPreserveFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormPreserveFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormPreserveFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat32`}
    public int shaderDenormPreserveFloat32() { return shaderDenormPreserveFloat32(this.segment(), 0L); }
    /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormPreserveFloat32(MemorySegment segment, long index, int value) { VH_shaderDenormPreserveFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat32(int value) { shaderDenormPreserveFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormPreserveFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormPreserveFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormPreserveFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormPreserveFloat64`}
    public int shaderDenormPreserveFloat64() { return shaderDenormPreserveFloat64(this.segment(), 0L); }
    /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormPreserveFloat64(MemorySegment segment, long index, int value) { VH_shaderDenormPreserveFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormPreserveFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat64(int value) { shaderDenormPreserveFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormFlushToZeroFloat16(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat16.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat16`}
    public int shaderDenormFlushToZeroFloat16() { return shaderDenormFlushToZeroFloat16(this.segment(), 0L); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormFlushToZeroFloat16(MemorySegment segment, long index, int value) { VH_shaderDenormFlushToZeroFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat16(int value) { shaderDenormFlushToZeroFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormFlushToZeroFloat32(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat32.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat32`}
    public int shaderDenormFlushToZeroFloat32() { return shaderDenormFlushToZeroFloat32(this.segment(), 0L); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormFlushToZeroFloat32(MemorySegment segment, long index, int value) { VH_shaderDenormFlushToZeroFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat32(int value) { shaderDenormFlushToZeroFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDenormFlushToZeroFloat64(MemorySegment segment, long index) { return (int) VH_shaderDenormFlushToZeroFloat64.get(segment, 0L, index); }
    /// {@return `shaderDenormFlushToZeroFloat64`}
    public int shaderDenormFlushToZeroFloat64() { return shaderDenormFlushToZeroFloat64(this.segment(), 0L); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDenormFlushToZeroFloat64(MemorySegment segment, long index, int value) { VH_shaderDenormFlushToZeroFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat64(int value) { shaderDenormFlushToZeroFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTEFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat16`}
    public int shaderRoundingModeRTEFloat16() { return shaderRoundingModeRTEFloat16(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTEFloat16(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTEFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat16(int value) { shaderRoundingModeRTEFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTEFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat32`}
    public int shaderRoundingModeRTEFloat32() { return shaderRoundingModeRTEFloat32(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTEFloat32(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTEFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat32(int value) { shaderRoundingModeRTEFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTEFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTEFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTEFloat64`}
    public int shaderRoundingModeRTEFloat64() { return shaderRoundingModeRTEFloat64(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTEFloat64(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTEFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat64(int value) { shaderRoundingModeRTEFloat64(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTZFloat16(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat16.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat16`}
    public int shaderRoundingModeRTZFloat16() { return shaderRoundingModeRTZFloat16(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTZFloat16(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTZFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat16(int value) { shaderRoundingModeRTZFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat32` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTZFloat32(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat32.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat32`}
    public int shaderRoundingModeRTZFloat32() { return shaderRoundingModeRTZFloat32(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTZFloat32(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTZFloat32.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat32(int value) { shaderRoundingModeRTZFloat32(this.segment(), 0L, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat64` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRoundingModeRTZFloat64(MemorySegment segment, long index) { return (int) VH_shaderRoundingModeRTZFloat64.get(segment, 0L, index); }
    /// {@return `shaderRoundingModeRTZFloat64`}
    public int shaderRoundingModeRTZFloat64() { return shaderRoundingModeRTZFloat64(this.segment(), 0L); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRoundingModeRTZFloat64(MemorySegment segment, long index, int value) { VH_shaderRoundingModeRTZFloat64.set(segment, 0L, index, value); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat64(int value) { shaderRoundingModeRTZFloat64(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFloatControlsPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFloatControlsPropertiesKHR`
    public VkPhysicalDeviceFloatControlsPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFloatControlsPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFloatControlsPropertiesKHR`
    public VkPhysicalDeviceFloatControlsPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFloatControlsPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR at(long index, Consumer<VkPhysicalDeviceFloatControlsPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `denormBehaviorIndependence` at the given index}
    /// @param index the index of the struct buffer
    public int denormBehaviorIndependenceAt(long index) { return denormBehaviorIndependence(this.segment(), index); }
    /// Sets `denormBehaviorIndependence` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR denormBehaviorIndependenceAt(long index, int value) { denormBehaviorIndependence(this.segment(), index, value); return this; }

    /// {@return `roundingModeIndependence` at the given index}
    /// @param index the index of the struct buffer
    public int roundingModeIndependenceAt(long index) { return roundingModeIndependence(this.segment(), index); }
    /// Sets `roundingModeIndependence` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR roundingModeIndependenceAt(long index, int value) { roundingModeIndependence(this.segment(), index, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSignedZeroInfNanPreserveFloat16At(long index) { return shaderSignedZeroInfNanPreserveFloat16(this.segment(), index); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat16At(long index, int value) { shaderSignedZeroInfNanPreserveFloat16(this.segment(), index, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat32` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSignedZeroInfNanPreserveFloat32At(long index) { return shaderSignedZeroInfNanPreserveFloat32(this.segment(), index); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat32At(long index, int value) { shaderSignedZeroInfNanPreserveFloat32(this.segment(), index, value); return this; }

    /// {@return `shaderSignedZeroInfNanPreserveFloat64` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSignedZeroInfNanPreserveFloat64At(long index) { return shaderSignedZeroInfNanPreserveFloat64(this.segment(), index); }
    /// Sets `shaderSignedZeroInfNanPreserveFloat64` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat64At(long index, int value) { shaderSignedZeroInfNanPreserveFloat64(this.segment(), index, value); return this; }

    /// {@return `shaderDenormPreserveFloat16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDenormPreserveFloat16At(long index) { return shaderDenormPreserveFloat16(this.segment(), index); }
    /// Sets `shaderDenormPreserveFloat16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat16At(long index, int value) { shaderDenormPreserveFloat16(this.segment(), index, value); return this; }

    /// {@return `shaderDenormPreserveFloat32` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDenormPreserveFloat32At(long index) { return shaderDenormPreserveFloat32(this.segment(), index); }
    /// Sets `shaderDenormPreserveFloat32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat32At(long index, int value) { shaderDenormPreserveFloat32(this.segment(), index, value); return this; }

    /// {@return `shaderDenormPreserveFloat64` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDenormPreserveFloat64At(long index) { return shaderDenormPreserveFloat64(this.segment(), index); }
    /// Sets `shaderDenormPreserveFloat64` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat64At(long index, int value) { shaderDenormPreserveFloat64(this.segment(), index, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDenormFlushToZeroFloat16At(long index) { return shaderDenormFlushToZeroFloat16(this.segment(), index); }
    /// Sets `shaderDenormFlushToZeroFloat16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat16At(long index, int value) { shaderDenormFlushToZeroFloat16(this.segment(), index, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat32` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDenormFlushToZeroFloat32At(long index) { return shaderDenormFlushToZeroFloat32(this.segment(), index); }
    /// Sets `shaderDenormFlushToZeroFloat32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat32At(long index, int value) { shaderDenormFlushToZeroFloat32(this.segment(), index, value); return this; }

    /// {@return `shaderDenormFlushToZeroFloat64` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDenormFlushToZeroFloat64At(long index) { return shaderDenormFlushToZeroFloat64(this.segment(), index); }
    /// Sets `shaderDenormFlushToZeroFloat64` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat64At(long index, int value) { shaderDenormFlushToZeroFloat64(this.segment(), index, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderRoundingModeRTEFloat16At(long index) { return shaderRoundingModeRTEFloat16(this.segment(), index); }
    /// Sets `shaderRoundingModeRTEFloat16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat16At(long index, int value) { shaderRoundingModeRTEFloat16(this.segment(), index, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat32` at the given index}
    /// @param index the index of the struct buffer
    public int shaderRoundingModeRTEFloat32At(long index) { return shaderRoundingModeRTEFloat32(this.segment(), index); }
    /// Sets `shaderRoundingModeRTEFloat32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat32At(long index, int value) { shaderRoundingModeRTEFloat32(this.segment(), index, value); return this; }

    /// {@return `shaderRoundingModeRTEFloat64` at the given index}
    /// @param index the index of the struct buffer
    public int shaderRoundingModeRTEFloat64At(long index) { return shaderRoundingModeRTEFloat64(this.segment(), index); }
    /// Sets `shaderRoundingModeRTEFloat64` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat64At(long index, int value) { shaderRoundingModeRTEFloat64(this.segment(), index, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderRoundingModeRTZFloat16At(long index) { return shaderRoundingModeRTZFloat16(this.segment(), index); }
    /// Sets `shaderRoundingModeRTZFloat16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat16At(long index, int value) { shaderRoundingModeRTZFloat16(this.segment(), index, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat32` at the given index}
    /// @param index the index of the struct buffer
    public int shaderRoundingModeRTZFloat32At(long index) { return shaderRoundingModeRTZFloat32(this.segment(), index); }
    /// Sets `shaderRoundingModeRTZFloat32` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat32At(long index, int value) { shaderRoundingModeRTZFloat32(this.segment(), index, value); return this; }

    /// {@return `shaderRoundingModeRTZFloat64` at the given index}
    /// @param index the index of the struct buffer
    public int shaderRoundingModeRTZFloat64At(long index) { return shaderRoundingModeRTZFloat64(this.segment(), index); }
    /// Sets `shaderRoundingModeRTZFloat64` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat64At(long index, int value) { shaderRoundingModeRTZFloat64(this.segment(), index, value); return this; }

}
