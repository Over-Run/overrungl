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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExternalMemoryPropertiesKHR {
///     ((uint32_t) VkFlags) VkExternalMemoryFeatureFlags externalMemoryFeatures;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlags compatibleHandleTypes;
/// };
/// ```
public final class VkExternalMemoryPropertiesKHR extends GroupType {
    /// The struct layout of `VkExternalMemoryPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    /// The byte offset of `externalMemoryFeatures`.
    public static final long OFFSET_externalMemoryFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryFeatures"));
    /// The memory layout of `externalMemoryFeatures`.
    public static final MemoryLayout LAYOUT_externalMemoryFeatures = LAYOUT.select(PathElement.groupElement("externalMemoryFeatures"));
    /// The [VarHandle] of `externalMemoryFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalMemoryFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryFeatures"));
    /// The byte offset of `exportFromImportedHandleTypes`.
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The memory layout of `exportFromImportedHandleTypes`.
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The byte offset of `compatibleHandleTypes`.
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    /// The memory layout of `compatibleHandleTypes`.
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));

    /// Creates `VkExternalMemoryPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalMemoryPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalMemoryPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalMemoryPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalMemoryPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalMemoryPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalMemoryPropertiesKHR`
    public static VkExternalMemoryPropertiesKHR alloc(SegmentAllocator allocator) { return new VkExternalMemoryPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalMemoryPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalMemoryPropertiesKHR`
    public static VkExternalMemoryPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExternalMemoryPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param externalMemoryFeatures `externalMemoryFeatures`
    /// @param exportFromImportedHandleTypes `exportFromImportedHandleTypes`
    /// @param compatibleHandleTypes `compatibleHandleTypes`
    /// @return the allocated `VkExternalMemoryPropertiesKHR`
    public static VkExternalMemoryPropertiesKHR allocInit(SegmentAllocator allocator, int externalMemoryFeatures, int exportFromImportedHandleTypes, int compatibleHandleTypes) {
        return alloc(allocator).externalMemoryFeatures(externalMemoryFeatures).exportFromImportedHandleTypes(exportFromImportedHandleTypes).compatibleHandleTypes(compatibleHandleTypes);
    }

    /// Allocates a `VkExternalMemoryPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param externalMemoryFeatures `externalMemoryFeatures`
    /// @param exportFromImportedHandleTypes `exportFromImportedHandleTypes`
    /// @return the allocated `VkExternalMemoryPropertiesKHR`
    public static VkExternalMemoryPropertiesKHR allocInit(SegmentAllocator allocator, int externalMemoryFeatures, int exportFromImportedHandleTypes) {
        return alloc(allocator).externalMemoryFeatures(externalMemoryFeatures).exportFromImportedHandleTypes(exportFromImportedHandleTypes);
    }

    /// Allocates a `VkExternalMemoryPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param externalMemoryFeatures `externalMemoryFeatures`
    /// @return the allocated `VkExternalMemoryPropertiesKHR`
    public static VkExternalMemoryPropertiesKHR allocInit(SegmentAllocator allocator, int externalMemoryFeatures) {
        return alloc(allocator).externalMemoryFeatures(externalMemoryFeatures);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalMemoryPropertiesKHR copyFrom(VkExternalMemoryPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalMemoryPropertiesKHR reinterpret(long count) { return new VkExternalMemoryPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalMemoryFeatures(MemorySegment segment, long index) { return (int) VH_externalMemoryFeatures.get(segment, 0L, index); }
    /// {@return `externalMemoryFeatures`}
    public int externalMemoryFeatures() { return externalMemoryFeatures(this.segment(), 0L); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalMemoryFeatures(MemorySegment segment, long index, int value) { VH_externalMemoryFeatures.set(segment, 0L, index, value); }
    /// Sets `externalMemoryFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryPropertiesKHR externalMemoryFeatures(int value) { externalMemoryFeatures(this.segment(), 0L, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    public int exportFromImportedHandleTypes() { return exportFromImportedHandleTypes(this.segment(), 0L); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void exportFromImportedHandleTypes(MemorySegment segment, long index, int value) { VH_exportFromImportedHandleTypes.set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryPropertiesKHR exportFromImportedHandleTypes(int value) { exportFromImportedHandleTypes(this.segment(), 0L, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    public int compatibleHandleTypes() { return compatibleHandleTypes(this.segment(), 0L); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compatibleHandleTypes(MemorySegment segment, long index, int value) { VH_compatibleHandleTypes.set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryPropertiesKHR compatibleHandleTypes(int value) { compatibleHandleTypes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExternalMemoryPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalMemoryPropertiesKHR`
    public VkExternalMemoryPropertiesKHR asSlice(long index) { return new VkExternalMemoryPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalMemoryPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalMemoryPropertiesKHR`
    public VkExternalMemoryPropertiesKHR asSlice(long index, long count) { return new VkExternalMemoryPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalMemoryPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalMemoryPropertiesKHR at(long index, Consumer<VkExternalMemoryPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int externalMemoryFeaturesAt(long index) { return externalMemoryFeatures(this.segment(), index); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryPropertiesKHR externalMemoryFeaturesAt(long index, int value) { externalMemoryFeatures(this.segment(), index, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int exportFromImportedHandleTypesAt(long index) { return exportFromImportedHandleTypes(this.segment(), index); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryPropertiesKHR exportFromImportedHandleTypesAt(long index, int value) { exportFromImportedHandleTypes(this.segment(), index, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int compatibleHandleTypesAt(long index) { return compatibleHandleTypes(this.segment(), index); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryPropertiesKHR compatibleHandleTypesAt(long index, int value) { compatibleHandleTypes(this.segment(), index, value); return this; }

}
