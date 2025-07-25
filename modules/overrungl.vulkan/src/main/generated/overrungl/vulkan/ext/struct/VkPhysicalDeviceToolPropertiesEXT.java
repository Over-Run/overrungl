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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceToolPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     char name[256];
///     char version[256];
///     ((uint32_t) VkFlags) VkToolPurposeFlags purposes;
///     char description[256];
///     char layer[256];
/// };
/// ```
public final class VkPhysicalDeviceToolPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceToolPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("version"),
        ValueLayout.JAVA_INT.withName("purposes"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("description"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("layer")
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
    /// The byte offset of `name`.
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    /// The memory layout of `name`.
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    /// The byte offset of `version`.
    public static final long OFFSET_version = LAYOUT.byteOffset(PathElement.groupElement("version"));
    /// The memory layout of `version`.
    public static final MemoryLayout LAYOUT_version = LAYOUT.select(PathElement.groupElement("version"));
    /// The [VarHandle] of `version` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_version = LAYOUT.arrayElementVarHandle(PathElement.groupElement("version"), PathElement.sequenceElement());
    /// The byte offset of `purposes`.
    public static final long OFFSET_purposes = LAYOUT.byteOffset(PathElement.groupElement("purposes"));
    /// The memory layout of `purposes`.
    public static final MemoryLayout LAYOUT_purposes = LAYOUT.select(PathElement.groupElement("purposes"));
    /// The [VarHandle] of `purposes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_purposes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("purposes"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `description` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The byte offset of `layer`.
    public static final long OFFSET_layer = LAYOUT.byteOffset(PathElement.groupElement("layer"));
    /// The memory layout of `layer`.
    public static final MemoryLayout LAYOUT_layer = LAYOUT.select(PathElement.groupElement("layer"));
    /// The [VarHandle] of `layer` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_layer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layer"), PathElement.sequenceElement());

    /// Creates `VkPhysicalDeviceToolPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceToolPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceToolPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceToolPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceToolPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceToolPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceToolPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceToolPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceToolPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceToolPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceToolPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceToolPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceToolPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @param version `version`
    /// @param purposes `purposes`
    /// @param description `description`
    /// @param layer `layer`
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name, MemorySegment version, int purposes, MemorySegment description, MemorySegment layer) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name).version(version).purposes(purposes).description(description).layer(layer);
    }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @param version `version`
    /// @param purposes `purposes`
    /// @param description `description`
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name, MemorySegment version, int purposes, MemorySegment description) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name).version(version).purposes(purposes).description(description);
    }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @param version `version`
    /// @param purposes `purposes`
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name, MemorySegment version, int purposes) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name).version(version).purposes(purposes);
    }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @param version `version`
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name, MemorySegment version) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name).version(version);
    }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param name `name`
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment name) {
        return alloc(allocator).sType(sType).pNext(pNext).name(name);
    }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceToolPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceToolPropertiesEXT`
    public static VkPhysicalDeviceToolPropertiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT copyFrom(VkPhysicalDeviceToolPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceToolPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceToolPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceToolPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceToolPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment name(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte name(MemorySegment segment, long index, long index0) { return (byte) VH_name.get(segment, 0L, index, index0); }
    /// {@return `name`}
    public MemorySegment name() { return name(this.segment(), 0L); }
    /// {@return `name`}
    /// @param index0 the Index 0 of the array
    public byte name(long index0) { return name(this.segment(), 0L, index0); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void name(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_name, index), LAYOUT_name.byteSize()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void name(MemorySegment segment, long index, long index0, byte value) { VH_name.set(segment, 0L, index, index0, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT name(MemorySegment value) { name(this.segment(), 0L, value); return this; }
    /// Sets `name` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT name(long index0, byte value) { name(this.segment(), 0L, index0, value); return this; }

    /// {@return `version` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment version(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_version, index), LAYOUT_version); }
    /// {@return `version` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte version(MemorySegment segment, long index, long index0) { return (byte) VH_version.get(segment, 0L, index, index0); }
    /// {@return `version`}
    public MemorySegment version() { return version(this.segment(), 0L); }
    /// {@return `version`}
    /// @param index0 the Index 0 of the array
    public byte version(long index0) { return version(this.segment(), 0L, index0); }
    /// Sets `version` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void version(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_version, index), LAYOUT_version.byteSize()); }
    /// Sets `version` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void version(MemorySegment segment, long index, long index0, byte value) { VH_version.set(segment, 0L, index, index0, value); }
    /// Sets `version` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT version(MemorySegment value) { version(this.segment(), 0L, value); return this; }
    /// Sets `version` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT version(long index0, byte value) { version(this.segment(), 0L, index0, value); return this; }

    /// {@return `purposes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int purposes(MemorySegment segment, long index) { return (int) VH_purposes.get(segment, 0L, index); }
    /// {@return `purposes`}
    public int purposes() { return purposes(this.segment(), 0L); }
    /// Sets `purposes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void purposes(MemorySegment segment, long index, int value) { VH_purposes.set(segment, 0L, index, value); }
    /// Sets `purposes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT purposes(int value) { purposes(this.segment(), 0L, value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte description(MemorySegment segment, long index, long index0) { return (byte) VH_description.get(segment, 0L, index, index0); }
    /// {@return `description`}
    public MemorySegment description() { return description(this.segment(), 0L); }
    /// {@return `description`}
    /// @param index0 the Index 0 of the array
    public byte description(long index0) { return description(this.segment(), 0L, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void description(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), LAYOUT_description.byteSize()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void description(MemorySegment segment, long index, long index0, byte value) { VH_description.set(segment, 0L, index, index0, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT description(MemorySegment value) { description(this.segment(), 0L, value); return this; }
    /// Sets `description` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT description(long index0, byte value) { description(this.segment(), 0L, index0, value); return this; }

    /// {@return `layer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment layer(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_layer, index), LAYOUT_layer); }
    /// {@return `layer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte layer(MemorySegment segment, long index, long index0) { return (byte) VH_layer.get(segment, 0L, index, index0); }
    /// {@return `layer`}
    public MemorySegment layer() { return layer(this.segment(), 0L); }
    /// {@return `layer`}
    /// @param index0 the Index 0 of the array
    public byte layer(long index0) { return layer(this.segment(), 0L, index0); }
    /// Sets `layer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layer(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_layer, index), LAYOUT_layer.byteSize()); }
    /// Sets `layer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void layer(MemorySegment segment, long index, long index0, byte value) { VH_layer.set(segment, 0L, index, index0, value); }
    /// Sets `layer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT layer(MemorySegment value) { layer(this.segment(), 0L, value); return this; }
    /// Sets `layer` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT layer(long index0, byte value) { layer(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceToolPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceToolPropertiesEXT`
    public VkPhysicalDeviceToolPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceToolPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceToolPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceToolPropertiesEXT`
    public VkPhysicalDeviceToolPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceToolPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceToolPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT at(long index, Consumer<VkPhysicalDeviceToolPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `name` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment nameAt(long index) { return name(this.segment(), index); }
    /// {@return `name` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte nameAt(long index, long index0) { return name(this.segment(), index, index0); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT nameAt(long index, MemorySegment value) { name(this.segment(), index, value); return this; }
    /// Sets `name` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT nameAt(long index, long index0, byte value) { name(this.segment(), index, index0, value); return this; }

    /// {@return `version` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment versionAt(long index) { return version(this.segment(), index); }
    /// {@return `version` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte versionAt(long index, long index0) { return version(this.segment(), index, index0); }
    /// Sets `version` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT versionAt(long index, MemorySegment value) { version(this.segment(), index, value); return this; }
    /// Sets `version` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT versionAt(long index, long index0, byte value) { version(this.segment(), index, index0, value); return this; }

    /// {@return `purposes` at the given index}
    /// @param index the index of the struct buffer
    public int purposesAt(long index) { return purposes(this.segment(), index); }
    /// Sets `purposes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT purposesAt(long index, int value) { purposes(this.segment(), index, value); return this; }

    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment descriptionAt(long index) { return description(this.segment(), index); }
    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte descriptionAt(long index, long index0) { return description(this.segment(), index, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT descriptionAt(long index, MemorySegment value) { description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT descriptionAt(long index, long index0, byte value) { description(this.segment(), index, index0, value); return this; }

    /// {@return `layer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment layerAt(long index) { return layer(this.segment(), index); }
    /// {@return `layer` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte layerAt(long index, long index0) { return layer(this.segment(), index, index0); }
    /// Sets `layer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT layerAt(long index, MemorySegment value) { layer(this.segment(), index, value); return this; }
    /// Sets `layer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceToolPropertiesEXT layerAt(long index, long index0, byte value) { layer(this.segment(), index, index0, value); return this; }

}
