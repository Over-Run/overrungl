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
/// ### imageFormatProperties
/// [Byte offset][#OFFSET_imageFormatProperties] - [Memory layout][#ML_imageFormatProperties] - [Getter][#imageFormatProperties()] - [Setter][#imageFormatProperties(java.lang.foreign.MemorySegment)]
/// ### externalMemoryFeatures
/// [VarHandle][#VH_externalMemoryFeatures] - [Getter][#externalMemoryFeatures()] - [Setter][#externalMemoryFeatures(int)]
/// ### exportFromImportedHandleTypes
/// [VarHandle][#VH_exportFromImportedHandleTypes] - [Getter][#exportFromImportedHandleTypes()] - [Setter][#exportFromImportedHandleTypes(int)]
/// ### compatibleHandleTypes
/// [VarHandle][#VH_compatibleHandleTypes] - [Getter][#compatibleHandleTypes()] - [Setter][#compatibleHandleTypes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExternalImageFormatPropertiesNV {
///     VkImageFormatProperties imageFormatProperties;
///     VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
///     VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
///     VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
/// } VkExternalImageFormatPropertiesNV;
/// ```
public sealed class VkExternalImageFormatPropertiesNV extends Struct {
    /// The struct layout of `VkExternalImageFormatPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageFormatProperties.LAYOUT.withName("imageFormatProperties"),
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    /// The byte offset of `imageFormatProperties`.
    public static final long OFFSET_imageFormatProperties = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
    /// The memory layout of `imageFormatProperties`.
    public static final MemoryLayout ML_imageFormatProperties = LAYOUT.select(PathElement.groupElement("imageFormatProperties"));
    /// The [VarHandle] of `externalMemoryFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_externalMemoryFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryFeatures"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkExternalImageFormatPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment); }

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExternalImageFormatPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalImageFormatPropertiesNV`
    public static VkExternalImageFormatPropertiesNV alloc(SegmentAllocator allocator) { return new VkExternalImageFormatPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExternalImageFormatPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalImageFormatPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExternalImageFormatPropertiesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalImageFormatPropertiesNV`
    public static VkExternalImageFormatPropertiesNV allocInit(SegmentAllocator allocator, @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment imageFormatProperties, @CType("VkExternalMemoryFeatureFlagsNV") int externalMemoryFeatures, @CType("VkExternalMemoryHandleTypeFlagsNV") int exportFromImportedHandleTypes, @CType("VkExternalMemoryHandleTypeFlagsNV") int compatibleHandleTypes) { return alloc(allocator).imageFormatProperties(imageFormatProperties).externalMemoryFeatures(externalMemoryFeatures).exportFromImportedHandleTypes(exportFromImportedHandleTypes).compatibleHandleTypes(compatibleHandleTypes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalImageFormatPropertiesNV copyFrom(VkExternalImageFormatPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `imageFormatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment get_imageFormatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageFormatProperties, index), ML_imageFormatProperties); }
    /// {@return `imageFormatProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment get_imageFormatProperties(MemorySegment segment) { return VkExternalImageFormatPropertiesNV.get_imageFormatProperties(segment, 0L); }
    /// {@return `imageFormatProperties`}
    public @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment imageFormatProperties() { return VkExternalImageFormatPropertiesNV.get_imageFormatProperties(this.segment()); }
    /// Sets `imageFormatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageFormatProperties(MemorySegment segment, long index, @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageFormatProperties, index), ML_imageFormatProperties.byteSize()); }
    /// Sets `imageFormatProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageFormatProperties(MemorySegment segment, @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment value) { VkExternalImageFormatPropertiesNV.set_imageFormatProperties(segment, 0L, value); }
    /// Sets `imageFormatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV imageFormatProperties(@CType("VkImageFormatProperties") java.lang.foreign.MemorySegment value) { VkExternalImageFormatPropertiesNV.set_imageFormatProperties(this.segment(), value); return this; }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryFeatureFlagsNV") int get_externalMemoryFeatures(MemorySegment segment, long index) { return (int) VH_externalMemoryFeatures.get(segment, 0L, index); }
    /// {@return `externalMemoryFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryFeatureFlagsNV") int get_externalMemoryFeatures(MemorySegment segment) { return VkExternalImageFormatPropertiesNV.get_externalMemoryFeatures(segment, 0L); }
    /// {@return `externalMemoryFeatures`}
    public @CType("VkExternalMemoryFeatureFlagsNV") int externalMemoryFeatures() { return VkExternalImageFormatPropertiesNV.get_externalMemoryFeatures(this.segment()); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalMemoryFeatures(MemorySegment segment, long index, @CType("VkExternalMemoryFeatureFlagsNV") int value) { VH_externalMemoryFeatures.set(segment, 0L, index, value); }
    /// Sets `externalMemoryFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalMemoryFeatures(MemorySegment segment, @CType("VkExternalMemoryFeatureFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_externalMemoryFeatures(segment, 0L, value); }
    /// Sets `externalMemoryFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV externalMemoryFeatures(@CType("VkExternalMemoryFeatureFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_externalMemoryFeatures(this.segment(), value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryHandleTypeFlagsNV") int get_exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryHandleTypeFlagsNV") int get_exportFromImportedHandleTypes(MemorySegment segment) { return VkExternalImageFormatPropertiesNV.get_exportFromImportedHandleTypes(segment, 0L); }
    /// {@return `exportFromImportedHandleTypes`}
    public @CType("VkExternalMemoryHandleTypeFlagsNV") int exportFromImportedHandleTypes() { return VkExternalImageFormatPropertiesNV.get_exportFromImportedHandleTypes(this.segment()); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, long index, @CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VH_exportFromImportedHandleTypes.set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, @CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_exportFromImportedHandleTypes(segment, 0L, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV exportFromImportedHandleTypes(@CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_exportFromImportedHandleTypes(this.segment(), value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryHandleTypeFlagsNV") int get_compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryHandleTypeFlagsNV") int get_compatibleHandleTypes(MemorySegment segment) { return VkExternalImageFormatPropertiesNV.get_compatibleHandleTypes(segment, 0L); }
    /// {@return `compatibleHandleTypes`}
    public @CType("VkExternalMemoryHandleTypeFlagsNV") int compatibleHandleTypes() { return VkExternalImageFormatPropertiesNV.get_compatibleHandleTypes(this.segment()); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, long index, @CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VH_compatibleHandleTypes.set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, @CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_compatibleHandleTypes(segment, 0L, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV compatibleHandleTypes(@CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_compatibleHandleTypes(this.segment(), value); return this; }

    /// A buffer of [VkExternalImageFormatPropertiesNV].
    public static final class Buffer extends VkExternalImageFormatPropertiesNV {
        private final long elementCount;

        /// Creates `VkExternalImageFormatPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExternalImageFormatPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExternalImageFormatPropertiesNV`
        public VkExternalImageFormatPropertiesNV asSlice(long index) { return new VkExternalImageFormatPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExternalImageFormatPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExternalImageFormatPropertiesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `imageFormatProperties` at the given index}
        /// @param index the index
        public @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment imageFormatPropertiesAt(long index) { return VkExternalImageFormatPropertiesNV.get_imageFormatProperties(this.segment(), index); }
        /// Sets `imageFormatProperties` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageFormatPropertiesAt(long index, @CType("VkImageFormatProperties") java.lang.foreign.MemorySegment value) { VkExternalImageFormatPropertiesNV.set_imageFormatProperties(this.segment(), index, value); return this; }

        /// {@return `externalMemoryFeatures` at the given index}
        /// @param index the index
        public @CType("VkExternalMemoryFeatureFlagsNV") int externalMemoryFeaturesAt(long index) { return VkExternalImageFormatPropertiesNV.get_externalMemoryFeatures(this.segment(), index); }
        /// Sets `externalMemoryFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer externalMemoryFeaturesAt(long index, @CType("VkExternalMemoryFeatureFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_externalMemoryFeatures(this.segment(), index, value); return this; }

        /// {@return `exportFromImportedHandleTypes` at the given index}
        /// @param index the index
        public @CType("VkExternalMemoryHandleTypeFlagsNV") int exportFromImportedHandleTypesAt(long index) { return VkExternalImageFormatPropertiesNV.get_exportFromImportedHandleTypes(this.segment(), index); }
        /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer exportFromImportedHandleTypesAt(long index, @CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_exportFromImportedHandleTypes(this.segment(), index, value); return this; }

        /// {@return `compatibleHandleTypes` at the given index}
        /// @param index the index
        public @CType("VkExternalMemoryHandleTypeFlagsNV") int compatibleHandleTypesAt(long index) { return VkExternalImageFormatPropertiesNV.get_compatibleHandleTypes(this.segment(), index); }
        /// Sets `compatibleHandleTypes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer compatibleHandleTypesAt(long index, @CType("VkExternalMemoryHandleTypeFlagsNV") int value) { VkExternalImageFormatPropertiesNV.set_compatibleHandleTypes(this.segment(), index, value); return this; }

    }
}
