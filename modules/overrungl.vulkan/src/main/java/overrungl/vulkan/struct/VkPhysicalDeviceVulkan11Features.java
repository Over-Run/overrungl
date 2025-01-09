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
/// ### storageBuffer16BitAccess
/// [VarHandle][#VH_storageBuffer16BitAccess] - [Getter][#storageBuffer16BitAccess()] - [Setter][#storageBuffer16BitAccess(int)]
/// ### uniformAndStorageBuffer16BitAccess
/// [VarHandle][#VH_uniformAndStorageBuffer16BitAccess] - [Getter][#uniformAndStorageBuffer16BitAccess()] - [Setter][#uniformAndStorageBuffer16BitAccess(int)]
/// ### storagePushConstant16
/// [VarHandle][#VH_storagePushConstant16] - [Getter][#storagePushConstant16()] - [Setter][#storagePushConstant16(int)]
/// ### storageInputOutput16
/// [VarHandle][#VH_storageInputOutput16] - [Getter][#storageInputOutput16()] - [Setter][#storageInputOutput16(int)]
/// ### multiview
/// [VarHandle][#VH_multiview] - [Getter][#multiview()] - [Setter][#multiview(int)]
/// ### multiviewGeometryShader
/// [VarHandle][#VH_multiviewGeometryShader] - [Getter][#multiviewGeometryShader()] - [Setter][#multiviewGeometryShader(int)]
/// ### multiviewTessellationShader
/// [VarHandle][#VH_multiviewTessellationShader] - [Getter][#multiviewTessellationShader()] - [Setter][#multiviewTessellationShader(int)]
/// ### variablePointersStorageBuffer
/// [VarHandle][#VH_variablePointersStorageBuffer] - [Getter][#variablePointersStorageBuffer()] - [Setter][#variablePointersStorageBuffer(int)]
/// ### variablePointers
/// [VarHandle][#VH_variablePointers] - [Getter][#variablePointers()] - [Setter][#variablePointers(int)]
/// ### protectedMemory
/// [VarHandle][#VH_protectedMemory] - [Getter][#protectedMemory()] - [Setter][#protectedMemory(int)]
/// ### samplerYcbcrConversion
/// [VarHandle][#VH_samplerYcbcrConversion] - [Getter][#samplerYcbcrConversion()] - [Setter][#samplerYcbcrConversion(int)]
/// ### shaderDrawParameters
/// [VarHandle][#VH_shaderDrawParameters] - [Getter][#shaderDrawParameters()] - [Setter][#shaderDrawParameters(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan11Features {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 storageBuffer16BitAccess;
///     VkBool32 uniformAndStorageBuffer16BitAccess;
///     VkBool32 storagePushConstant16;
///     VkBool32 storageInputOutput16;
///     VkBool32 multiview;
///     VkBool32 multiviewGeometryShader;
///     VkBool32 multiviewTessellationShader;
///     VkBool32 variablePointersStorageBuffer;
///     VkBool32 variablePointers;
///     VkBool32 protectedMemory;
///     VkBool32 samplerYcbcrConversion;
///     VkBool32 shaderDrawParameters;
/// } VkPhysicalDeviceVulkan11Features;
/// ```
public final class VkPhysicalDeviceVulkan11Features extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkan11Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers"),
        ValueLayout.JAVA_INT.withName("protectedMemory"),
        ValueLayout.JAVA_INT.withName("samplerYcbcrConversion"),
        ValueLayout.JAVA_INT.withName("shaderDrawParameters")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `storageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformAndStorageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The [VarHandle] of `storagePushConstant16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storagePushConstant16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant16"));
    /// The [VarHandle] of `storageInputOutput16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageInputOutput16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageInputOutput16"));
    /// The [VarHandle] of `multiview` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiview = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiview"));
    /// The [VarHandle] of `multiviewGeometryShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiviewGeometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewGeometryShader"));
    /// The [VarHandle] of `multiviewTessellationShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiviewTessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewTessellationShader"));
    /// The [VarHandle] of `variablePointersStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variablePointersStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The [VarHandle] of `variablePointers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variablePointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers"));
    /// The [VarHandle] of `protectedMemory` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_protectedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedMemory"));
    /// The [VarHandle] of `samplerYcbcrConversion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samplerYcbcrConversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversion"));
    /// The [VarHandle] of `shaderDrawParameters` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDrawParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDrawParameters"));

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan11Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Features of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment); }

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Features ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan11Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan11Features ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan11Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVulkan11Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan11Features`
    public static VkPhysicalDeviceVulkan11Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan11Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan11Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan11Features`
    public static VkPhysicalDeviceVulkan11Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan11Features(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceVulkan11Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkan11Features`
    public VkPhysicalDeviceVulkan11Features asSlice(long index) { return new VkPhysicalDeviceVulkan11Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceVulkan11Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkan11Features`
    public VkPhysicalDeviceVulkan11Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan11Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan11Features.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan11Features.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Features.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Features.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Features.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan11Features.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVulkan11Features.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Features.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Features.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan11Features.set_pNext(this.segment(), value); return this; }

    /// {@return `storageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `storageBuffer16BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageBuffer16BitAccess(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_storageBuffer16BitAccess(segment, 0L); }
    /// {@return `storageBuffer16BitAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int storageBuffer16BitAccessAt(long index) { return VkPhysicalDeviceVulkan11Features.get_storageBuffer16BitAccess(this.segment(), index); }
    /// {@return `storageBuffer16BitAccess`}
    public @CType("VkBool32") int storageBuffer16BitAccess() { return VkPhysicalDeviceVulkan11Features.get_storageBuffer16BitAccess(this.segment()); }
    /// Sets `storageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageBuffer16BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `storageBuffer16BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageBuffer16BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storageBuffer16BitAccess(segment, 0L, value); }
    /// Sets `storageBuffer16BitAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storageBuffer16BitAccess(this.segment(), index, value); return this; }
    /// Sets `storageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storageBuffer16BitAccess(this.segment(), value); return this; }

    /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer16BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_uniformAndStorageBuffer16BitAccess(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_uniformAndStorageBuffer16BitAccess(segment, 0L); }
    /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int uniformAndStorageBuffer16BitAccessAt(long index) { return VkPhysicalDeviceVulkan11Features.get_uniformAndStorageBuffer16BitAccess(this.segment(), index); }
    /// {@return `uniformAndStorageBuffer16BitAccess`}
    public @CType("VkBool32") int uniformAndStorageBuffer16BitAccess() { return VkPhysicalDeviceVulkan11Features.get_uniformAndStorageBuffer16BitAccess(this.segment()); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_uniformAndStorageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformAndStorageBuffer16BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_uniformAndStorageBuffer16BitAccess(segment, 0L, value); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_uniformAndStorageBuffer16BitAccess(this.segment(), index, value); return this; }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_uniformAndStorageBuffer16BitAccess(this.segment(), value); return this; }

    /// {@return `storagePushConstant16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storagePushConstant16(MemorySegment segment, long index) { return (int) VH_storagePushConstant16.get(segment, 0L, index); }
    /// {@return `storagePushConstant16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storagePushConstant16(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_storagePushConstant16(segment, 0L); }
    /// {@return `storagePushConstant16` at the given index}
    /// @param index the index
    public @CType("VkBool32") int storagePushConstant16At(long index) { return VkPhysicalDeviceVulkan11Features.get_storagePushConstant16(this.segment(), index); }
    /// {@return `storagePushConstant16`}
    public @CType("VkBool32") int storagePushConstant16() { return VkPhysicalDeviceVulkan11Features.get_storagePushConstant16(this.segment()); }
    /// Sets `storagePushConstant16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storagePushConstant16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storagePushConstant16.set(segment, 0L, index, value); }
    /// Sets `storagePushConstant16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storagePushConstant16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storagePushConstant16(segment, 0L, value); }
    /// Sets `storagePushConstant16` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storagePushConstant16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storagePushConstant16(this.segment(), index, value); return this; }
    /// Sets `storagePushConstant16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storagePushConstant16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storagePushConstant16(this.segment(), value); return this; }

    /// {@return `storageInputOutput16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageInputOutput16(MemorySegment segment, long index) { return (int) VH_storageInputOutput16.get(segment, 0L, index); }
    /// {@return `storageInputOutput16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageInputOutput16(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_storageInputOutput16(segment, 0L); }
    /// {@return `storageInputOutput16` at the given index}
    /// @param index the index
    public @CType("VkBool32") int storageInputOutput16At(long index) { return VkPhysicalDeviceVulkan11Features.get_storageInputOutput16(this.segment(), index); }
    /// {@return `storageInputOutput16`}
    public @CType("VkBool32") int storageInputOutput16() { return VkPhysicalDeviceVulkan11Features.get_storageInputOutput16(this.segment()); }
    /// Sets `storageInputOutput16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageInputOutput16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageInputOutput16.set(segment, 0L, index, value); }
    /// Sets `storageInputOutput16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageInputOutput16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storageInputOutput16(segment, 0L, value); }
    /// Sets `storageInputOutput16` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageInputOutput16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storageInputOutput16(this.segment(), index, value); return this; }
    /// Sets `storageInputOutput16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features storageInputOutput16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_storageInputOutput16(this.segment(), value); return this; }

    /// {@return `multiview` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiview(MemorySegment segment, long index) { return (int) VH_multiview.get(segment, 0L, index); }
    /// {@return `multiview`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiview(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_multiview(segment, 0L); }
    /// {@return `multiview` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multiviewAt(long index) { return VkPhysicalDeviceVulkan11Features.get_multiview(this.segment(), index); }
    /// {@return `multiview`}
    public @CType("VkBool32") int multiview() { return VkPhysicalDeviceVulkan11Features.get_multiview(this.segment()); }
    /// Sets `multiview` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiview(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiview.set(segment, 0L, index, value); }
    /// Sets `multiview` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiview(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiview(segment, 0L, value); }
    /// Sets `multiview` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiview(this.segment(), index, value); return this; }
    /// Sets `multiview` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiview(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiview(this.segment(), value); return this; }

    /// {@return `multiviewGeometryShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiviewGeometryShader(MemorySegment segment, long index) { return (int) VH_multiviewGeometryShader.get(segment, 0L, index); }
    /// {@return `multiviewGeometryShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiviewGeometryShader(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_multiviewGeometryShader(segment, 0L); }
    /// {@return `multiviewGeometryShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multiviewGeometryShaderAt(long index) { return VkPhysicalDeviceVulkan11Features.get_multiviewGeometryShader(this.segment(), index); }
    /// {@return `multiviewGeometryShader`}
    public @CType("VkBool32") int multiviewGeometryShader() { return VkPhysicalDeviceVulkan11Features.get_multiviewGeometryShader(this.segment()); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiviewGeometryShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiviewGeometryShader.set(segment, 0L, index, value); }
    /// Sets `multiviewGeometryShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiviewGeometryShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiviewGeometryShader(segment, 0L, value); }
    /// Sets `multiviewGeometryShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiviewGeometryShader(this.segment(), index, value); return this; }
    /// Sets `multiviewGeometryShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiviewGeometryShader(this.segment(), value); return this; }

    /// {@return `multiviewTessellationShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiviewTessellationShader(MemorySegment segment, long index) { return (int) VH_multiviewTessellationShader.get(segment, 0L, index); }
    /// {@return `multiviewTessellationShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiviewTessellationShader(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_multiviewTessellationShader(segment, 0L); }
    /// {@return `multiviewTessellationShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multiviewTessellationShaderAt(long index) { return VkPhysicalDeviceVulkan11Features.get_multiviewTessellationShader(this.segment(), index); }
    /// {@return `multiviewTessellationShader`}
    public @CType("VkBool32") int multiviewTessellationShader() { return VkPhysicalDeviceVulkan11Features.get_multiviewTessellationShader(this.segment()); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiviewTessellationShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiviewTessellationShader.set(segment, 0L, index, value); }
    /// Sets `multiviewTessellationShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiviewTessellationShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiviewTessellationShader(segment, 0L, value); }
    /// Sets `multiviewTessellationShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiviewTessellationShader(this.segment(), index, value); return this; }
    /// Sets `multiviewTessellationShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_multiviewTessellationShader(this.segment(), value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variablePointersStorageBuffer(MemorySegment segment, long index) { return (int) VH_variablePointersStorageBuffer.get(segment, 0L, index); }
    /// {@return `variablePointersStorageBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variablePointersStorageBuffer(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_variablePointersStorageBuffer(segment, 0L); }
    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param index the index
    public @CType("VkBool32") int variablePointersStorageBufferAt(long index) { return VkPhysicalDeviceVulkan11Features.get_variablePointersStorageBuffer(this.segment(), index); }
    /// {@return `variablePointersStorageBuffer`}
    public @CType("VkBool32") int variablePointersStorageBuffer() { return VkPhysicalDeviceVulkan11Features.get_variablePointersStorageBuffer(this.segment()); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variablePointersStorageBuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variablePointersStorageBuffer.set(segment, 0L, index, value); }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variablePointersStorageBuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_variablePointersStorageBuffer(segment, 0L, value); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_variablePointersStorageBuffer(this.segment(), index, value); return this; }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_variablePointersStorageBuffer(this.segment(), value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variablePointers(MemorySegment segment, long index) { return (int) VH_variablePointers.get(segment, 0L, index); }
    /// {@return `variablePointers`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variablePointers(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_variablePointers(segment, 0L); }
    /// {@return `variablePointers` at the given index}
    /// @param index the index
    public @CType("VkBool32") int variablePointersAt(long index) { return VkPhysicalDeviceVulkan11Features.get_variablePointers(this.segment(), index); }
    /// {@return `variablePointers`}
    public @CType("VkBool32") int variablePointers() { return VkPhysicalDeviceVulkan11Features.get_variablePointers(this.segment()); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variablePointers(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variablePointers.set(segment, 0L, index, value); }
    /// Sets `variablePointers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variablePointers(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_variablePointers(segment, 0L, value); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointersAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_variablePointers(this.segment(), index, value); return this; }
    /// Sets `variablePointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features variablePointers(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_variablePointers(this.segment(), value); return this; }

    /// {@return `protectedMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_protectedMemory(MemorySegment segment, long index) { return (int) VH_protectedMemory.get(segment, 0L, index); }
    /// {@return `protectedMemory`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_protectedMemory(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_protectedMemory(segment, 0L); }
    /// {@return `protectedMemory` at the given index}
    /// @param index the index
    public @CType("VkBool32") int protectedMemoryAt(long index) { return VkPhysicalDeviceVulkan11Features.get_protectedMemory(this.segment(), index); }
    /// {@return `protectedMemory`}
    public @CType("VkBool32") int protectedMemory() { return VkPhysicalDeviceVulkan11Features.get_protectedMemory(this.segment()); }
    /// Sets `protectedMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_protectedMemory(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_protectedMemory.set(segment, 0L, index, value); }
    /// Sets `protectedMemory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_protectedMemory(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_protectedMemory(segment, 0L, value); }
    /// Sets `protectedMemory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features protectedMemoryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_protectedMemory(this.segment(), index, value); return this; }
    /// Sets `protectedMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features protectedMemory(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_protectedMemory(this.segment(), value); return this; }

    /// {@return `samplerYcbcrConversion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_samplerYcbcrConversion(MemorySegment segment, long index) { return (int) VH_samplerYcbcrConversion.get(segment, 0L, index); }
    /// {@return `samplerYcbcrConversion`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_samplerYcbcrConversion(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_samplerYcbcrConversion(segment, 0L); }
    /// {@return `samplerYcbcrConversion` at the given index}
    /// @param index the index
    public @CType("VkBool32") int samplerYcbcrConversionAt(long index) { return VkPhysicalDeviceVulkan11Features.get_samplerYcbcrConversion(this.segment(), index); }
    /// {@return `samplerYcbcrConversion`}
    public @CType("VkBool32") int samplerYcbcrConversion() { return VkPhysicalDeviceVulkan11Features.get_samplerYcbcrConversion(this.segment()); }
    /// Sets `samplerYcbcrConversion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerYcbcrConversion(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_samplerYcbcrConversion.set(segment, 0L, index, value); }
    /// Sets `samplerYcbcrConversion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerYcbcrConversion(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_samplerYcbcrConversion(segment, 0L, value); }
    /// Sets `samplerYcbcrConversion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversionAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_samplerYcbcrConversion(this.segment(), index, value); return this; }
    /// Sets `samplerYcbcrConversion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_samplerYcbcrConversion(this.segment(), value); return this; }

    /// {@return `shaderDrawParameters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDrawParameters(MemorySegment segment, long index) { return (int) VH_shaderDrawParameters.get(segment, 0L, index); }
    /// {@return `shaderDrawParameters`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDrawParameters(MemorySegment segment) { return VkPhysicalDeviceVulkan11Features.get_shaderDrawParameters(segment, 0L); }
    /// {@return `shaderDrawParameters` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderDrawParametersAt(long index) { return VkPhysicalDeviceVulkan11Features.get_shaderDrawParameters(this.segment(), index); }
    /// {@return `shaderDrawParameters`}
    public @CType("VkBool32") int shaderDrawParameters() { return VkPhysicalDeviceVulkan11Features.get_shaderDrawParameters(this.segment()); }
    /// Sets `shaderDrawParameters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDrawParameters(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDrawParameters.set(segment, 0L, index, value); }
    /// Sets `shaderDrawParameters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDrawParameters(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_shaderDrawParameters(segment, 0L, value); }
    /// Sets `shaderDrawParameters` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features shaderDrawParametersAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_shaderDrawParameters(this.segment(), index, value); return this; }
    /// Sets `shaderDrawParameters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan11Features.set_shaderDrawParameters(this.segment(), value); return this; }

}
