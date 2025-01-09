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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### pLayerName
/// [VarHandle][#VH_pLayerName] - [Getter][#pLayerName()] - [Setter][#pLayerName(java.lang.foreign.MemorySegment)]
/// ### pSettingName
/// [VarHandle][#VH_pSettingName] - [Getter][#pSettingName()] - [Setter][#pSettingName(java.lang.foreign.MemorySegment)]
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### valueCount
/// [VarHandle][#VH_valueCount] - [Getter][#valueCount()] - [Setter][#valueCount(int)]
/// ### pValues
/// [VarHandle][#VH_pValues] - [Getter][#pValues()] - [Setter][#pValues(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLayerSettingEXT {
///     const char * pLayerName;
///     const char * pSettingName;
///     VkLayerSettingTypeEXT type;
///     uint32_t valueCount;
///     const void * pValues;
/// } VkLayerSettingEXT;
/// ```
public final class VkLayerSettingEXT extends Struct {
    /// The struct layout of `VkLayerSettingEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("pLayerName"),
        ValueLayout.ADDRESS.withName("pSettingName"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("valueCount"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    /// The [VarHandle] of `pLayerName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLayerName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayerName"));
    /// The [VarHandle] of `pSettingName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSettingName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSettingName"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `valueCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_valueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("valueCount"));
    /// The [VarHandle] of `pValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    /// Creates `VkLayerSettingEXT` with the given segment.
    /// @param segment the memory segment
    public VkLayerSettingEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLayerSettingEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerSettingEXT(segment); }

    /// Creates `VkLayerSettingEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerSettingEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLayerSettingEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerSettingEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerSettingEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkLayerSettingEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerSettingEXT`
    public static VkLayerSettingEXT alloc(SegmentAllocator allocator) { return new VkLayerSettingEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLayerSettingEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerSettingEXT`
    public static VkLayerSettingEXT alloc(SegmentAllocator allocator, long count) { return new VkLayerSettingEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkLayerSettingEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLayerSettingEXT`
    public VkLayerSettingEXT asSlice(long index) { return new VkLayerSettingEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkLayerSettingEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLayerSettingEXT`
    public VkLayerSettingEXT asSlice(long index, long count) { return new VkLayerSettingEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `pLayerName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pLayerName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLayerName.get(segment, 0L, index); }
    /// {@return `pLayerName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pLayerName(MemorySegment segment) { return VkLayerSettingEXT.get_pLayerName(segment, 0L); }
    /// {@return `pLayerName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pLayerNameAt(long index) { return VkLayerSettingEXT.get_pLayerName(this.segment(), index); }
    /// {@return `pLayerName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pLayerName() { return VkLayerSettingEXT.get_pLayerName(this.segment()); }
    /// Sets `pLayerName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLayerName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pLayerName.set(segment, 0L, index, value); }
    /// Sets `pLayerName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLayerName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pLayerName(segment, 0L, value); }
    /// Sets `pLayerName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pLayerNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pLayerName(this.segment(), index, value); return this; }
    /// Sets `pLayerName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pLayerName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pLayerName(this.segment(), value); return this; }

    /// {@return `pSettingName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pSettingName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSettingName.get(segment, 0L, index); }
    /// {@return `pSettingName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pSettingName(MemorySegment segment) { return VkLayerSettingEXT.get_pSettingName(segment, 0L); }
    /// {@return `pSettingName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pSettingNameAt(long index) { return VkLayerSettingEXT.get_pSettingName(this.segment(), index); }
    /// {@return `pSettingName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pSettingName() { return VkLayerSettingEXT.get_pSettingName(this.segment()); }
    /// Sets `pSettingName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSettingName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pSettingName.set(segment, 0L, index, value); }
    /// Sets `pSettingName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSettingName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pSettingName(segment, 0L, value); }
    /// Sets `pSettingName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pSettingNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pSettingName(this.segment(), index, value); return this; }
    /// Sets `pSettingName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pSettingName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pSettingName(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkLayerSettingTypeEXT") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkLayerSettingTypeEXT") int get_type(MemorySegment segment) { return VkLayerSettingEXT.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkLayerSettingTypeEXT") int typeAt(long index) { return VkLayerSettingEXT.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkLayerSettingTypeEXT") int type() { return VkLayerSettingEXT.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkLayerSettingTypeEXT") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkLayerSettingTypeEXT") int value) { VkLayerSettingEXT.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT typeAt(long index, @CType("VkLayerSettingTypeEXT") int value) { VkLayerSettingEXT.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT type(@CType("VkLayerSettingTypeEXT") int value) { VkLayerSettingEXT.set_type(this.segment(), value); return this; }

    /// {@return `valueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_valueCount(MemorySegment segment, long index) { return (int) VH_valueCount.get(segment, 0L, index); }
    /// {@return `valueCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_valueCount(MemorySegment segment) { return VkLayerSettingEXT.get_valueCount(segment, 0L); }
    /// {@return `valueCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int valueCountAt(long index) { return VkLayerSettingEXT.get_valueCount(this.segment(), index); }
    /// {@return `valueCount`}
    public @CType("uint32_t") int valueCount() { return VkLayerSettingEXT.get_valueCount(this.segment()); }
    /// Sets `valueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_valueCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_valueCount.set(segment, 0L, index, value); }
    /// Sets `valueCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_valueCount(MemorySegment segment, @CType("uint32_t") int value) { VkLayerSettingEXT.set_valueCount(segment, 0L, value); }
    /// Sets `valueCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT valueCountAt(long index, @CType("uint32_t") int value) { VkLayerSettingEXT.set_valueCount(this.segment(), index, value); return this; }
    /// Sets `valueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT valueCount(@CType("uint32_t") int value) { VkLayerSettingEXT.set_valueCount(this.segment(), value); return this; }

    /// {@return `pValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pValues.get(segment, 0L, index); }
    /// {@return `pValues`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pValues(MemorySegment segment) { return VkLayerSettingEXT.get_pValues(segment, 0L); }
    /// {@return `pValues` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pValuesAt(long index) { return VkLayerSettingEXT.get_pValues(this.segment(), index); }
    /// {@return `pValues`}
    public @CType("const void *") java.lang.foreign.MemorySegment pValues() { return VkLayerSettingEXT.get_pValues(this.segment()); }
    /// Sets `pValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pValues(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pValues.set(segment, 0L, index, value); }
    /// Sets `pValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pValues(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pValues(segment, 0L, value); }
    /// Sets `pValues` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pValuesAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pValues(this.segment(), index, value); return this; }
    /// Sets `pValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerSettingEXT pValues(@CType("const void *") java.lang.foreign.MemorySegment value) { VkLayerSettingEXT.set_pValues(this.segment(), value); return this; }

}
