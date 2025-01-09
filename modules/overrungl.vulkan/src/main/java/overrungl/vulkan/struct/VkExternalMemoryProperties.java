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
/// ### externalMemoryFeatures
/// [VarHandle][#VH_externalMemoryFeatures] - [Getter][#externalMemoryFeatures()] - [Setter][#externalMemoryFeatures(int)]
/// ### exportFromImportedHandleTypes
/// [VarHandle][#VH_exportFromImportedHandleTypes] - [Getter][#exportFromImportedHandleTypes()] - [Setter][#exportFromImportedHandleTypes(int)]
/// ### compatibleHandleTypes
/// [VarHandle][#VH_compatibleHandleTypes] - [Getter][#compatibleHandleTypes()] - [Setter][#compatibleHandleTypes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExternalMemoryProperties {
///     VkExternalMemoryFeatureFlags externalMemoryFeatures;
///     VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalMemoryHandleTypeFlags compatibleHandleTypes;
/// } VkExternalMemoryProperties;
/// ```
public final class VkExternalMemoryProperties extends Struct {
    /// The struct layout of `VkExternalMemoryProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    /// The [VarHandle] of `externalMemoryFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_externalMemoryFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryFeatures"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));

    /// Creates `VkExternalMemoryProperties` with the given segment.
    /// @param segment the memory segment
    public VkExternalMemoryProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExternalMemoryProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment); }

    /// Creates `VkExternalMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExternalMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExternalMemoryProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalMemoryProperties`
    public static VkExternalMemoryProperties alloc(SegmentAllocator allocator) { return new VkExternalMemoryProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExternalMemoryProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalMemoryProperties`
    public static VkExternalMemoryProperties alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryProperties(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkExternalMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalMemoryProperties`
    public VkExternalMemoryProperties asSlice(long index) { return new VkExternalMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkExternalMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalMemoryProperties`
    public VkExternalMemoryProperties asSlice(long index, long count) { return new VkExternalMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryFeatureFlags") int get_externalMemoryFeatures(MemorySegment segment, long index) { return (int) VH_externalMemoryFeatures.get(segment, 0L, index); }
    /// {@return `externalMemoryFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryFeatureFlags") int get_externalMemoryFeatures(MemorySegment segment) { return VkExternalMemoryProperties.get_externalMemoryFeatures(segment, 0L); }
    /// {@return `externalMemoryFeatures` at the given index}
    /// @param index the index
    public @CType("VkExternalMemoryFeatureFlags") int externalMemoryFeaturesAt(long index) { return VkExternalMemoryProperties.get_externalMemoryFeatures(this.segment(), index); }
    /// {@return `externalMemoryFeatures`}
    public @CType("VkExternalMemoryFeatureFlags") int externalMemoryFeatures() { return VkExternalMemoryProperties.get_externalMemoryFeatures(this.segment()); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalMemoryFeatures(MemorySegment segment, long index, @CType("VkExternalMemoryFeatureFlags") int value) { VH_externalMemoryFeatures.set(segment, 0L, index, value); }
    /// Sets `externalMemoryFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalMemoryFeatures(MemorySegment segment, @CType("VkExternalMemoryFeatureFlags") int value) { VkExternalMemoryProperties.set_externalMemoryFeatures(segment, 0L, value); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties externalMemoryFeaturesAt(long index, @CType("VkExternalMemoryFeatureFlags") int value) { VkExternalMemoryProperties.set_externalMemoryFeatures(this.segment(), index, value); return this; }
    /// Sets `externalMemoryFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties externalMemoryFeatures(@CType("VkExternalMemoryFeatureFlags") int value) { VkExternalMemoryProperties.set_externalMemoryFeatures(this.segment(), value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryHandleTypeFlags") int get_exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryHandleTypeFlags") int get_exportFromImportedHandleTypes(MemorySegment segment) { return VkExternalMemoryProperties.get_exportFromImportedHandleTypes(segment, 0L); }
    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param index the index
    public @CType("VkExternalMemoryHandleTypeFlags") int exportFromImportedHandleTypesAt(long index) { return VkExternalMemoryProperties.get_exportFromImportedHandleTypes(this.segment(), index); }
    /// {@return `exportFromImportedHandleTypes`}
    public @CType("VkExternalMemoryHandleTypeFlags") int exportFromImportedHandleTypes() { return VkExternalMemoryProperties.get_exportFromImportedHandleTypes(this.segment()); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, long index, @CType("VkExternalMemoryHandleTypeFlags") int value) { VH_exportFromImportedHandleTypes.set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, @CType("VkExternalMemoryHandleTypeFlags") int value) { VkExternalMemoryProperties.set_exportFromImportedHandleTypes(segment, 0L, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties exportFromImportedHandleTypesAt(long index, @CType("VkExternalMemoryHandleTypeFlags") int value) { VkExternalMemoryProperties.set_exportFromImportedHandleTypes(this.segment(), index, value); return this; }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties exportFromImportedHandleTypes(@CType("VkExternalMemoryHandleTypeFlags") int value) { VkExternalMemoryProperties.set_exportFromImportedHandleTypes(this.segment(), value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryHandleTypeFlags") int get_compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryHandleTypeFlags") int get_compatibleHandleTypes(MemorySegment segment) { return VkExternalMemoryProperties.get_compatibleHandleTypes(segment, 0L); }
    /// {@return `compatibleHandleTypes` at the given index}
    /// @param index the index
    public @CType("VkExternalMemoryHandleTypeFlags") int compatibleHandleTypesAt(long index) { return VkExternalMemoryProperties.get_compatibleHandleTypes(this.segment(), index); }
    /// {@return `compatibleHandleTypes`}
    public @CType("VkExternalMemoryHandleTypeFlags") int compatibleHandleTypes() { return VkExternalMemoryProperties.get_compatibleHandleTypes(this.segment()); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, long index, @CType("VkExternalMemoryHandleTypeFlags") int value) { VH_compatibleHandleTypes.set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, @CType("VkExternalMemoryHandleTypeFlags") int value) { VkExternalMemoryProperties.set_compatibleHandleTypes(segment, 0L, value); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties compatibleHandleTypesAt(long index, @CType("VkExternalMemoryHandleTypeFlags") int value) { VkExternalMemoryProperties.set_compatibleHandleTypes(this.segment(), index, value); return this; }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties compatibleHandleTypes(@CType("VkExternalMemoryHandleTypeFlags") int value) { VkExternalMemoryProperties.set_compatibleHandleTypes(this.segment(), value); return this; }

}
