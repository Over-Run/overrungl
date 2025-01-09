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
/// ### exportFromImportedHandleTypes
/// [VarHandle][#VH_exportFromImportedHandleTypes] - [Getter][#exportFromImportedHandleTypes()] - [Setter][#exportFromImportedHandleTypes(int)]
/// ### compatibleHandleTypes
/// [VarHandle][#VH_compatibleHandleTypes] - [Getter][#compatibleHandleTypes()] - [Setter][#compatibleHandleTypes(int)]
/// ### externalFenceFeatures
/// [VarHandle][#VH_externalFenceFeatures] - [Getter][#externalFenceFeatures()] - [Setter][#externalFenceFeatures(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExternalFenceProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkExternalFenceHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalFenceHandleTypeFlags compatibleHandleTypes;
///     VkExternalFenceFeatureFlags externalFenceFeatures;
/// } VkExternalFenceProperties;
/// ```
public final class VkExternalFenceProperties extends Struct {
    /// The struct layout of `VkExternalFenceProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalFenceFeatures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));
    /// The [VarHandle] of `externalFenceFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_externalFenceFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFenceFeatures"));

    /// Creates `VkExternalFenceProperties` with the given segment.
    /// @param segment the memory segment
    public VkExternalFenceProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExternalFenceProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFenceProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalFenceProperties(segment); }

    /// Creates `VkExternalFenceProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFenceProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalFenceProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExternalFenceProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFenceProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalFenceProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExternalFenceProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalFenceProperties`
    public static VkExternalFenceProperties alloc(SegmentAllocator allocator) { return new VkExternalFenceProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExternalFenceProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalFenceProperties`
    public static VkExternalFenceProperties alloc(SegmentAllocator allocator, long count) { return new VkExternalFenceProperties(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkExternalFenceProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalFenceProperties`
    public VkExternalFenceProperties asSlice(long index) { return new VkExternalFenceProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkExternalFenceProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalFenceProperties`
    public VkExternalFenceProperties asSlice(long index, long count) { return new VkExternalFenceProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExternalFenceProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExternalFenceProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExternalFenceProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExternalFenceProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkExternalFenceProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties sType(@CType("VkStructureType") int value) { VkExternalFenceProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExternalFenceProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExternalFenceProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkExternalFenceProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkExternalFenceProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkExternalFenceProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkExternalFenceProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalFenceHandleTypeFlags") int get_exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalFenceHandleTypeFlags") int get_exportFromImportedHandleTypes(MemorySegment segment) { return VkExternalFenceProperties.get_exportFromImportedHandleTypes(segment, 0L); }
    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param index the index
    public @CType("VkExternalFenceHandleTypeFlags") int exportFromImportedHandleTypesAt(long index) { return VkExternalFenceProperties.get_exportFromImportedHandleTypes(this.segment(), index); }
    /// {@return `exportFromImportedHandleTypes`}
    public @CType("VkExternalFenceHandleTypeFlags") int exportFromImportedHandleTypes() { return VkExternalFenceProperties.get_exportFromImportedHandleTypes(this.segment()); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, long index, @CType("VkExternalFenceHandleTypeFlags") int value) { VH_exportFromImportedHandleTypes.set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, @CType("VkExternalFenceHandleTypeFlags") int value) { VkExternalFenceProperties.set_exportFromImportedHandleTypes(segment, 0L, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties exportFromImportedHandleTypesAt(long index, @CType("VkExternalFenceHandleTypeFlags") int value) { VkExternalFenceProperties.set_exportFromImportedHandleTypes(this.segment(), index, value); return this; }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties exportFromImportedHandleTypes(@CType("VkExternalFenceHandleTypeFlags") int value) { VkExternalFenceProperties.set_exportFromImportedHandleTypes(this.segment(), value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalFenceHandleTypeFlags") int get_compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalFenceHandleTypeFlags") int get_compatibleHandleTypes(MemorySegment segment) { return VkExternalFenceProperties.get_compatibleHandleTypes(segment, 0L); }
    /// {@return `compatibleHandleTypes` at the given index}
    /// @param index the index
    public @CType("VkExternalFenceHandleTypeFlags") int compatibleHandleTypesAt(long index) { return VkExternalFenceProperties.get_compatibleHandleTypes(this.segment(), index); }
    /// {@return `compatibleHandleTypes`}
    public @CType("VkExternalFenceHandleTypeFlags") int compatibleHandleTypes() { return VkExternalFenceProperties.get_compatibleHandleTypes(this.segment()); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, long index, @CType("VkExternalFenceHandleTypeFlags") int value) { VH_compatibleHandleTypes.set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, @CType("VkExternalFenceHandleTypeFlags") int value) { VkExternalFenceProperties.set_compatibleHandleTypes(segment, 0L, value); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties compatibleHandleTypesAt(long index, @CType("VkExternalFenceHandleTypeFlags") int value) { VkExternalFenceProperties.set_compatibleHandleTypes(this.segment(), index, value); return this; }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties compatibleHandleTypes(@CType("VkExternalFenceHandleTypeFlags") int value) { VkExternalFenceProperties.set_compatibleHandleTypes(this.segment(), value); return this; }

    /// {@return `externalFenceFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalFenceFeatureFlags") int get_externalFenceFeatures(MemorySegment segment, long index) { return (int) VH_externalFenceFeatures.get(segment, 0L, index); }
    /// {@return `externalFenceFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalFenceFeatureFlags") int get_externalFenceFeatures(MemorySegment segment) { return VkExternalFenceProperties.get_externalFenceFeatures(segment, 0L); }
    /// {@return `externalFenceFeatures` at the given index}
    /// @param index the index
    public @CType("VkExternalFenceFeatureFlags") int externalFenceFeaturesAt(long index) { return VkExternalFenceProperties.get_externalFenceFeatures(this.segment(), index); }
    /// {@return `externalFenceFeatures`}
    public @CType("VkExternalFenceFeatureFlags") int externalFenceFeatures() { return VkExternalFenceProperties.get_externalFenceFeatures(this.segment()); }
    /// Sets `externalFenceFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFenceFeatures(MemorySegment segment, long index, @CType("VkExternalFenceFeatureFlags") int value) { VH_externalFenceFeatures.set(segment, 0L, index, value); }
    /// Sets `externalFenceFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFenceFeatures(MemorySegment segment, @CType("VkExternalFenceFeatureFlags") int value) { VkExternalFenceProperties.set_externalFenceFeatures(segment, 0L, value); }
    /// Sets `externalFenceFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties externalFenceFeaturesAt(long index, @CType("VkExternalFenceFeatureFlags") int value) { VkExternalFenceProperties.set_externalFenceFeatures(this.segment(), index, value); return this; }
    /// Sets `externalFenceFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFenceProperties externalFenceFeatures(@CType("VkExternalFenceFeatureFlags") int value) { VkExternalFenceProperties.set_externalFenceFeatures(this.segment(), value); return this; }

}
