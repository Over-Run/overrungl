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
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### name
/// [Byte offset][#OFFSET_name] - [Memory layout][#ML_name] - [Getter][#name()] - [Setter][#name(java.lang.foreign.MemorySegment)]
/// ### version
/// [Byte offset][#OFFSET_version] - [Memory layout][#ML_version] - [Getter][#version()] - [Setter][#version(java.lang.foreign.MemorySegment)]
/// ### purposes
/// [VarHandle][#VH_purposes] - [Getter][#purposes()] - [Setter][#purposes(int)]
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(java.lang.foreign.MemorySegment)]
/// ### layer
/// [Byte offset][#OFFSET_layer] - [Memory layout][#ML_layer] - [Getter][#layer()] - [Setter][#layer(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceToolProperties {
///     VkStructureType sType;
///     void * pNext;
///     char[VK_MAX_EXTENSION_NAME_SIZE] name;
///     char[VK_MAX_EXTENSION_NAME_SIZE] version;
///     VkToolPurposeFlags purposes;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
///     char[VK_MAX_EXTENSION_NAME_SIZE] layer;
/// } VkPhysicalDeviceToolProperties;
/// ```
public final class VkPhysicalDeviceToolProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceToolProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("version"),
        ValueLayout.JAVA_INT.withName("purposes"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layer")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout ML_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The byte offset of `version`.
    public static final long OFFSET_version = LAYOUT.byteOffset(PathElement.groupElement("version"));
    /// The memory layout of `version`.
    public static final MemoryLayout ML_version = LAYOUT.select(PathElement.groupElement("version"));
    /// The [VarHandle] of `purposes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_purposes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("purposes"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The byte offset of `layer`.
    public static final long OFFSET_layer = LAYOUT.byteOffset(PathElement.groupElement("layer"));
    /// The memory layout of `layer`.
    public static final MemoryLayout ML_layer = LAYOUT.select(PathElement.groupElement("layer"));

    /// Creates `VkPhysicalDeviceToolProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceToolProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceToolProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceToolProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceToolProperties(segment); }

    /// Creates `VkPhysicalDeviceToolProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceToolProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceToolProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceToolProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceToolProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceToolProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceToolProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceToolProperties`
    public static VkPhysicalDeviceToolProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceToolProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceToolProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceToolProperties`
    public static VkPhysicalDeviceToolProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceToolProperties(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceToolProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceToolProperties`
    public VkPhysicalDeviceToolProperties asSlice(long index) { return new VkPhysicalDeviceToolProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceToolProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceToolProperties`
    public VkPhysicalDeviceToolProperties asSlice(long index, long count) { return new VkPhysicalDeviceToolProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceToolProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceToolProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceToolProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceToolProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceToolProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceToolProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceToolProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceToolProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceToolProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_name, index), ML_name); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment) { return VkPhysicalDeviceToolProperties.get_name(segment, 0L); }
    /// {@return `name` at the given index}
    /// @param index the index
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment nameAt(long index) { return VkPhysicalDeviceToolProperties.get_name(this.segment(), index); }
    /// {@return `name`}
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment name() { return VkPhysicalDeviceToolProperties.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_name, index), ML_name.byteSize()); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_name(segment, 0L, value); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties nameAt(long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_name(this.segment(), index, value); return this; }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties name(@CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_name(this.segment(), value); return this; }

    /// {@return `version` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_version(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_version, index), ML_version); }
    /// {@return `version`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_version(MemorySegment segment) { return VkPhysicalDeviceToolProperties.get_version(segment, 0L); }
    /// {@return `version` at the given index}
    /// @param index the index
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment versionAt(long index) { return VkPhysicalDeviceToolProperties.get_version(this.segment(), index); }
    /// {@return `version`}
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment version() { return VkPhysicalDeviceToolProperties.get_version(this.segment()); }
    /// Sets `version` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_version(MemorySegment segment, long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_version, index), ML_version.byteSize()); }
    /// Sets `version` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_version(MemorySegment segment, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_version(segment, 0L, value); }
    /// Sets `version` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties versionAt(long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_version(this.segment(), index, value); return this; }
    /// Sets `version` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties version(@CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_version(this.segment(), value); return this; }

    /// {@return `purposes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkToolPurposeFlags") int get_purposes(MemorySegment segment, long index) { return (int) VH_purposes.get(segment, 0L, index); }
    /// {@return `purposes`}
    /// @param segment the segment of the struct
    public static @CType("VkToolPurposeFlags") int get_purposes(MemorySegment segment) { return VkPhysicalDeviceToolProperties.get_purposes(segment, 0L); }
    /// {@return `purposes` at the given index}
    /// @param index the index
    public @CType("VkToolPurposeFlags") int purposesAt(long index) { return VkPhysicalDeviceToolProperties.get_purposes(this.segment(), index); }
    /// {@return `purposes`}
    public @CType("VkToolPurposeFlags") int purposes() { return VkPhysicalDeviceToolProperties.get_purposes(this.segment()); }
    /// Sets `purposes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_purposes(MemorySegment segment, long index, @CType("VkToolPurposeFlags") int value) { VH_purposes.set(segment, 0L, index, value); }
    /// Sets `purposes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_purposes(MemorySegment segment, @CType("VkToolPurposeFlags") int value) { VkPhysicalDeviceToolProperties.set_purposes(segment, 0L, value); }
    /// Sets `purposes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties purposesAt(long index, @CType("VkToolPurposeFlags") int value) { VkPhysicalDeviceToolProperties.set_purposes(this.segment(), index, value); return this; }
    /// Sets `purposes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties purposes(@CType("VkToolPurposeFlags") int value) { VkPhysicalDeviceToolProperties.set_purposes(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment) { return VkPhysicalDeviceToolProperties.get_description(segment, 0L); }
    /// {@return `description` at the given index}
    /// @param index the index
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment descriptionAt(long index) { return VkPhysicalDeviceToolProperties.get_description(this.segment(), index); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description() { return VkPhysicalDeviceToolProperties.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_description(segment, 0L, value); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_description(this.segment(), value); return this; }

    /// {@return `layer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_layer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_layer, index), ML_layer); }
    /// {@return `layer`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_layer(MemorySegment segment) { return VkPhysicalDeviceToolProperties.get_layer(segment, 0L); }
    /// {@return `layer` at the given index}
    /// @param index the index
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment layerAt(long index) { return VkPhysicalDeviceToolProperties.get_layer(this.segment(), index); }
    /// {@return `layer`}
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment layer() { return VkPhysicalDeviceToolProperties.get_layer(this.segment()); }
    /// Sets `layer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layer(MemorySegment segment, long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_layer, index), ML_layer.byteSize()); }
    /// Sets `layer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layer(MemorySegment segment, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_layer(segment, 0L, value); }
    /// Sets `layer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties layerAt(long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_layer(this.segment(), index, value); return this; }
    /// Sets `layer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolProperties layer(@CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceToolProperties.set_layer(this.segment(), value); return this; }

}
