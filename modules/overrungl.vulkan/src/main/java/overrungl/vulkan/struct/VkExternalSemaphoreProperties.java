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
/// ### externalSemaphoreFeatures
/// [VarHandle][#VH_externalSemaphoreFeatures] - [Getter][#externalSemaphoreFeatures()] - [Setter][#externalSemaphoreFeatures(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExternalSemaphoreProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
///     VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
/// } VkExternalSemaphoreProperties;
/// ```
public final class VkExternalSemaphoreProperties extends Struct {
    /// The struct layout of `VkExternalSemaphoreProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalSemaphoreFeatures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));
    /// The [VarHandle] of `externalSemaphoreFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_externalSemaphoreFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalSemaphoreFeatures"));

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    /// @param segment the memory segment
    public VkExternalSemaphoreProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalSemaphoreProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalSemaphoreProperties(segment); }

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalSemaphoreProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalSemaphoreProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalSemaphoreProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalSemaphoreProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties alloc(SegmentAllocator allocator) { return new VkExternalSemaphoreProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties alloc(SegmentAllocator allocator, long count) { return new VkExternalSemaphoreProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExternalSemaphoreProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExternalSemaphoreProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExternalSemaphoreProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExternalSemaphoreProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkExternalSemaphoreProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties sType(@CType("VkStructureType") int value) { VkExternalSemaphoreProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExternalSemaphoreProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExternalSemaphoreProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkExternalSemaphoreProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkExternalSemaphoreProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkExternalSemaphoreProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkExternalSemaphoreProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalSemaphoreHandleTypeFlags") int get_exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalSemaphoreHandleTypeFlags") int get_exportFromImportedHandleTypes(MemorySegment segment) { return VkExternalSemaphoreProperties.get_exportFromImportedHandleTypes(segment, 0L); }
    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param index the index
    public @CType("VkExternalSemaphoreHandleTypeFlags") int exportFromImportedHandleTypesAt(long index) { return VkExternalSemaphoreProperties.get_exportFromImportedHandleTypes(this.segment(), index); }
    /// {@return `exportFromImportedHandleTypes`}
    public @CType("VkExternalSemaphoreHandleTypeFlags") int exportFromImportedHandleTypes() { return VkExternalSemaphoreProperties.get_exportFromImportedHandleTypes(this.segment()); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, long index, @CType("VkExternalSemaphoreHandleTypeFlags") int value) { VH_exportFromImportedHandleTypes.set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_exportFromImportedHandleTypes(MemorySegment segment, @CType("VkExternalSemaphoreHandleTypeFlags") int value) { VkExternalSemaphoreProperties.set_exportFromImportedHandleTypes(segment, 0L, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties exportFromImportedHandleTypesAt(long index, @CType("VkExternalSemaphoreHandleTypeFlags") int value) { VkExternalSemaphoreProperties.set_exportFromImportedHandleTypes(this.segment(), index, value); return this; }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties exportFromImportedHandleTypes(@CType("VkExternalSemaphoreHandleTypeFlags") int value) { VkExternalSemaphoreProperties.set_exportFromImportedHandleTypes(this.segment(), value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalSemaphoreHandleTypeFlags") int get_compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalSemaphoreHandleTypeFlags") int get_compatibleHandleTypes(MemorySegment segment) { return VkExternalSemaphoreProperties.get_compatibleHandleTypes(segment, 0L); }
    /// {@return `compatibleHandleTypes` at the given index}
    /// @param index the index
    public @CType("VkExternalSemaphoreHandleTypeFlags") int compatibleHandleTypesAt(long index) { return VkExternalSemaphoreProperties.get_compatibleHandleTypes(this.segment(), index); }
    /// {@return `compatibleHandleTypes`}
    public @CType("VkExternalSemaphoreHandleTypeFlags") int compatibleHandleTypes() { return VkExternalSemaphoreProperties.get_compatibleHandleTypes(this.segment()); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, long index, @CType("VkExternalSemaphoreHandleTypeFlags") int value) { VH_compatibleHandleTypes.set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compatibleHandleTypes(MemorySegment segment, @CType("VkExternalSemaphoreHandleTypeFlags") int value) { VkExternalSemaphoreProperties.set_compatibleHandleTypes(segment, 0L, value); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties compatibleHandleTypesAt(long index, @CType("VkExternalSemaphoreHandleTypeFlags") int value) { VkExternalSemaphoreProperties.set_compatibleHandleTypes(this.segment(), index, value); return this; }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties compatibleHandleTypes(@CType("VkExternalSemaphoreHandleTypeFlags") int value) { VkExternalSemaphoreProperties.set_compatibleHandleTypes(this.segment(), value); return this; }

    /// {@return `externalSemaphoreFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalSemaphoreFeatureFlags") int get_externalSemaphoreFeatures(MemorySegment segment, long index) { return (int) VH_externalSemaphoreFeatures.get(segment, 0L, index); }
    /// {@return `externalSemaphoreFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalSemaphoreFeatureFlags") int get_externalSemaphoreFeatures(MemorySegment segment) { return VkExternalSemaphoreProperties.get_externalSemaphoreFeatures(segment, 0L); }
    /// {@return `externalSemaphoreFeatures` at the given index}
    /// @param index the index
    public @CType("VkExternalSemaphoreFeatureFlags") int externalSemaphoreFeaturesAt(long index) { return VkExternalSemaphoreProperties.get_externalSemaphoreFeatures(this.segment(), index); }
    /// {@return `externalSemaphoreFeatures`}
    public @CType("VkExternalSemaphoreFeatureFlags") int externalSemaphoreFeatures() { return VkExternalSemaphoreProperties.get_externalSemaphoreFeatures(this.segment()); }
    /// Sets `externalSemaphoreFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalSemaphoreFeatures(MemorySegment segment, long index, @CType("VkExternalSemaphoreFeatureFlags") int value) { VH_externalSemaphoreFeatures.set(segment, 0L, index, value); }
    /// Sets `externalSemaphoreFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalSemaphoreFeatures(MemorySegment segment, @CType("VkExternalSemaphoreFeatureFlags") int value) { VkExternalSemaphoreProperties.set_externalSemaphoreFeatures(segment, 0L, value); }
    /// Sets `externalSemaphoreFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties externalSemaphoreFeaturesAt(long index, @CType("VkExternalSemaphoreFeatureFlags") int value) { VkExternalSemaphoreProperties.set_externalSemaphoreFeatures(this.segment(), index, value); return this; }
    /// Sets `externalSemaphoreFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties externalSemaphoreFeatures(@CType("VkExternalSemaphoreFeatureFlags") int value) { VkExternalSemaphoreProperties.set_externalSemaphoreFeatures(this.segment(), value); return this; }

}
