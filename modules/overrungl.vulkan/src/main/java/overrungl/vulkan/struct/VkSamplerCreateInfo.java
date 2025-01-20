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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### magFilter
/// [VarHandle][#VH_magFilter] - [Getter][#magFilter()] - [Setter][#magFilter(int)]
/// ### minFilter
/// [VarHandle][#VH_minFilter] - [Getter][#minFilter()] - [Setter][#minFilter(int)]
/// ### mipmapMode
/// [VarHandle][#VH_mipmapMode] - [Getter][#mipmapMode()] - [Setter][#mipmapMode(int)]
/// ### addressModeU
/// [VarHandle][#VH_addressModeU] - [Getter][#addressModeU()] - [Setter][#addressModeU(int)]
/// ### addressModeV
/// [VarHandle][#VH_addressModeV] - [Getter][#addressModeV()] - [Setter][#addressModeV(int)]
/// ### addressModeW
/// [VarHandle][#VH_addressModeW] - [Getter][#addressModeW()] - [Setter][#addressModeW(int)]
/// ### mipLodBias
/// [VarHandle][#VH_mipLodBias] - [Getter][#mipLodBias()] - [Setter][#mipLodBias(float)]
/// ### anisotropyEnable
/// [VarHandle][#VH_anisotropyEnable] - [Getter][#anisotropyEnable()] - [Setter][#anisotropyEnable(int)]
/// ### maxAnisotropy
/// [VarHandle][#VH_maxAnisotropy] - [Getter][#maxAnisotropy()] - [Setter][#maxAnisotropy(float)]
/// ### compareEnable
/// [VarHandle][#VH_compareEnable] - [Getter][#compareEnable()] - [Setter][#compareEnable(int)]
/// ### compareOp
/// [VarHandle][#VH_compareOp] - [Getter][#compareOp()] - [Setter][#compareOp(int)]
/// ### minLod
/// [VarHandle][#VH_minLod] - [Getter][#minLod()] - [Setter][#minLod(float)]
/// ### maxLod
/// [VarHandle][#VH_maxLod] - [Getter][#maxLod()] - [Setter][#maxLod(float)]
/// ### borderColor
/// [VarHandle][#VH_borderColor] - [Getter][#borderColor()] - [Setter][#borderColor(int)]
/// ### unnormalizedCoordinates
/// [VarHandle][#VH_unnormalizedCoordinates] - [Getter][#unnormalizedCoordinates()] - [Setter][#unnormalizedCoordinates(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkSamplerCreateFlags flags;
///     VkFilter magFilter;
///     VkFilter minFilter;
///     VkSamplerMipmapMode mipmapMode;
///     VkSamplerAddressMode addressModeU;
///     VkSamplerAddressMode addressModeV;
///     VkSamplerAddressMode addressModeW;
///     float mipLodBias;
///     VkBool32 anisotropyEnable;
///     float maxAnisotropy;
///     VkBool32 compareEnable;
///     VkCompareOp compareOp;
///     float minLod;
///     float maxLod;
///     VkBorderColor borderColor;
///     VkBool32 unnormalizedCoordinates;
/// } VkSamplerCreateInfo;
/// ```
public sealed class VkSamplerCreateInfo extends Struct {
    /// The struct layout of `VkSamplerCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("magFilter"),
        ValueLayout.JAVA_INT.withName("minFilter"),
        ValueLayout.JAVA_INT.withName("mipmapMode"),
        ValueLayout.JAVA_INT.withName("addressModeU"),
        ValueLayout.JAVA_INT.withName("addressModeV"),
        ValueLayout.JAVA_INT.withName("addressModeW"),
        ValueLayout.JAVA_FLOAT.withName("mipLodBias"),
        ValueLayout.JAVA_INT.withName("anisotropyEnable"),
        ValueLayout.JAVA_FLOAT.withName("maxAnisotropy"),
        ValueLayout.JAVA_INT.withName("compareEnable"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_FLOAT.withName("minLod"),
        ValueLayout.JAVA_FLOAT.withName("maxLod"),
        ValueLayout.JAVA_INT.withName("borderColor"),
        ValueLayout.JAVA_INT.withName("unnormalizedCoordinates")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `magFilter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_magFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("magFilter"));
    /// The [VarHandle] of `minFilter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minFilter"));
    /// The [VarHandle] of `mipmapMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mipmapMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipmapMode"));
    /// The [VarHandle] of `addressModeU` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_addressModeU = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeU"));
    /// The [VarHandle] of `addressModeV` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_addressModeV = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeV"));
    /// The [VarHandle] of `addressModeW` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_addressModeW = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressModeW"));
    /// The [VarHandle] of `mipLodBias` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_mipLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLodBias"));
    /// The [VarHandle] of `anisotropyEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_anisotropyEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("anisotropyEnable"));
    /// The [VarHandle] of `maxAnisotropy` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxAnisotropy"));
    /// The [VarHandle] of `compareEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compareEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareEnable"));
    /// The [VarHandle] of `compareOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareOp"));
    /// The [VarHandle] of `minLod` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLod"));
    /// The [VarHandle] of `maxLod` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLod"));
    /// The [VarHandle] of `borderColor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_borderColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColor"));
    /// The [VarHandle] of `unnormalizedCoordinates` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_unnormalizedCoordinates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unnormalizedCoordinates"));

    /// Creates `VkSamplerCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkSamplerCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment); }

    /// Creates `VkSamplerCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSamplerCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCreateInfo`
    public static VkSamplerCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCreateInfo`
    public static VkSamplerCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkSamplerCreateFlags") int flags, @CType("VkFilter") int magFilter, @CType("VkFilter") int minFilter, @CType("VkSamplerMipmapMode") int mipmapMode, @CType("VkSamplerAddressMode") int addressModeU, @CType("VkSamplerAddressMode") int addressModeV, @CType("VkSamplerAddressMode") int addressModeW, @CType("float") float mipLodBias, @CType("VkBool32") int anisotropyEnable, @CType("float") float maxAnisotropy, @CType("VkBool32") int compareEnable, @CType("VkCompareOp") int compareOp, @CType("float") float minLod, @CType("float") float maxLod, @CType("VkBorderColor") int borderColor, @CType("VkBool32") int unnormalizedCoordinates) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).magFilter(magFilter).minFilter(minFilter).mipmapMode(mipmapMode).addressModeU(addressModeU).addressModeV(addressModeV).addressModeW(addressModeW).mipLodBias(mipLodBias).anisotropyEnable(anisotropyEnable).maxAnisotropy(maxAnisotropy).compareEnable(compareEnable).compareOp(compareOp).minLod(minLod).maxLod(maxLod).borderColor(borderColor).unnormalizedCoordinates(unnormalizedCoordinates); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerCreateInfo copyFrom(VkSamplerCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo sType(@CType("VkStructureType") int value) { VkSamplerCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSamplerCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSamplerCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSamplerCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo pNext(@CType("const void *") MemorySegment value) { VkSamplerCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerCreateFlags") int get_flags(MemorySegment segment) { return VkSamplerCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkSamplerCreateFlags") int flags() { return VkSamplerCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSamplerCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSamplerCreateFlags") int value) { VkSamplerCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo flags(@CType("VkSamplerCreateFlags") int value) { VkSamplerCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `magFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFilter") int get_magFilter(MemorySegment segment, long index) { return (int) VH_magFilter.get(segment, 0L, index); }
    /// {@return `magFilter`}
    /// @param segment the segment of the struct
    public static @CType("VkFilter") int get_magFilter(MemorySegment segment) { return VkSamplerCreateInfo.get_magFilter(segment, 0L); }
    /// {@return `magFilter`}
    public @CType("VkFilter") int magFilter() { return VkSamplerCreateInfo.get_magFilter(this.segment()); }
    /// Sets `magFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_magFilter(MemorySegment segment, long index, @CType("VkFilter") int value) { VH_magFilter.set(segment, 0L, index, value); }
    /// Sets `magFilter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_magFilter(MemorySegment segment, @CType("VkFilter") int value) { VkSamplerCreateInfo.set_magFilter(segment, 0L, value); }
    /// Sets `magFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo magFilter(@CType("VkFilter") int value) { VkSamplerCreateInfo.set_magFilter(this.segment(), value); return this; }

    /// {@return `minFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFilter") int get_minFilter(MemorySegment segment, long index) { return (int) VH_minFilter.get(segment, 0L, index); }
    /// {@return `minFilter`}
    /// @param segment the segment of the struct
    public static @CType("VkFilter") int get_minFilter(MemorySegment segment) { return VkSamplerCreateInfo.get_minFilter(segment, 0L); }
    /// {@return `minFilter`}
    public @CType("VkFilter") int minFilter() { return VkSamplerCreateInfo.get_minFilter(this.segment()); }
    /// Sets `minFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minFilter(MemorySegment segment, long index, @CType("VkFilter") int value) { VH_minFilter.set(segment, 0L, index, value); }
    /// Sets `minFilter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minFilter(MemorySegment segment, @CType("VkFilter") int value) { VkSamplerCreateInfo.set_minFilter(segment, 0L, value); }
    /// Sets `minFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo minFilter(@CType("VkFilter") int value) { VkSamplerCreateInfo.set_minFilter(this.segment(), value); return this; }

    /// {@return `mipmapMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerMipmapMode") int get_mipmapMode(MemorySegment segment, long index) { return (int) VH_mipmapMode.get(segment, 0L, index); }
    /// {@return `mipmapMode`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerMipmapMode") int get_mipmapMode(MemorySegment segment) { return VkSamplerCreateInfo.get_mipmapMode(segment, 0L); }
    /// {@return `mipmapMode`}
    public @CType("VkSamplerMipmapMode") int mipmapMode() { return VkSamplerCreateInfo.get_mipmapMode(this.segment()); }
    /// Sets `mipmapMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mipmapMode(MemorySegment segment, long index, @CType("VkSamplerMipmapMode") int value) { VH_mipmapMode.set(segment, 0L, index, value); }
    /// Sets `mipmapMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mipmapMode(MemorySegment segment, @CType("VkSamplerMipmapMode") int value) { VkSamplerCreateInfo.set_mipmapMode(segment, 0L, value); }
    /// Sets `mipmapMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo mipmapMode(@CType("VkSamplerMipmapMode") int value) { VkSamplerCreateInfo.set_mipmapMode(this.segment(), value); return this; }

    /// {@return `addressModeU` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerAddressMode") int get_addressModeU(MemorySegment segment, long index) { return (int) VH_addressModeU.get(segment, 0L, index); }
    /// {@return `addressModeU`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerAddressMode") int get_addressModeU(MemorySegment segment) { return VkSamplerCreateInfo.get_addressModeU(segment, 0L); }
    /// {@return `addressModeU`}
    public @CType("VkSamplerAddressMode") int addressModeU() { return VkSamplerCreateInfo.get_addressModeU(this.segment()); }
    /// Sets `addressModeU` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_addressModeU(MemorySegment segment, long index, @CType("VkSamplerAddressMode") int value) { VH_addressModeU.set(segment, 0L, index, value); }
    /// Sets `addressModeU` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_addressModeU(MemorySegment segment, @CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeU(segment, 0L, value); }
    /// Sets `addressModeU` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeU(@CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeU(this.segment(), value); return this; }

    /// {@return `addressModeV` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerAddressMode") int get_addressModeV(MemorySegment segment, long index) { return (int) VH_addressModeV.get(segment, 0L, index); }
    /// {@return `addressModeV`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerAddressMode") int get_addressModeV(MemorySegment segment) { return VkSamplerCreateInfo.get_addressModeV(segment, 0L); }
    /// {@return `addressModeV`}
    public @CType("VkSamplerAddressMode") int addressModeV() { return VkSamplerCreateInfo.get_addressModeV(this.segment()); }
    /// Sets `addressModeV` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_addressModeV(MemorySegment segment, long index, @CType("VkSamplerAddressMode") int value) { VH_addressModeV.set(segment, 0L, index, value); }
    /// Sets `addressModeV` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_addressModeV(MemorySegment segment, @CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeV(segment, 0L, value); }
    /// Sets `addressModeV` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeV(@CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeV(this.segment(), value); return this; }

    /// {@return `addressModeW` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerAddressMode") int get_addressModeW(MemorySegment segment, long index) { return (int) VH_addressModeW.get(segment, 0L, index); }
    /// {@return `addressModeW`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerAddressMode") int get_addressModeW(MemorySegment segment) { return VkSamplerCreateInfo.get_addressModeW(segment, 0L); }
    /// {@return `addressModeW`}
    public @CType("VkSamplerAddressMode") int addressModeW() { return VkSamplerCreateInfo.get_addressModeW(this.segment()); }
    /// Sets `addressModeW` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_addressModeW(MemorySegment segment, long index, @CType("VkSamplerAddressMode") int value) { VH_addressModeW.set(segment, 0L, index, value); }
    /// Sets `addressModeW` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_addressModeW(MemorySegment segment, @CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeW(segment, 0L, value); }
    /// Sets `addressModeW` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo addressModeW(@CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeW(this.segment(), value); return this; }

    /// {@return `mipLodBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_mipLodBias(MemorySegment segment, long index) { return (float) VH_mipLodBias.get(segment, 0L, index); }
    /// {@return `mipLodBias`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_mipLodBias(MemorySegment segment) { return VkSamplerCreateInfo.get_mipLodBias(segment, 0L); }
    /// {@return `mipLodBias`}
    public @CType("float") float mipLodBias() { return VkSamplerCreateInfo.get_mipLodBias(this.segment()); }
    /// Sets `mipLodBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mipLodBias(MemorySegment segment, long index, @CType("float") float value) { VH_mipLodBias.set(segment, 0L, index, value); }
    /// Sets `mipLodBias` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mipLodBias(MemorySegment segment, @CType("float") float value) { VkSamplerCreateInfo.set_mipLodBias(segment, 0L, value); }
    /// Sets `mipLodBias` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo mipLodBias(@CType("float") float value) { VkSamplerCreateInfo.set_mipLodBias(this.segment(), value); return this; }

    /// {@return `anisotropyEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_anisotropyEnable(MemorySegment segment, long index) { return (int) VH_anisotropyEnable.get(segment, 0L, index); }
    /// {@return `anisotropyEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_anisotropyEnable(MemorySegment segment) { return VkSamplerCreateInfo.get_anisotropyEnable(segment, 0L); }
    /// {@return `anisotropyEnable`}
    public @CType("VkBool32") int anisotropyEnable() { return VkSamplerCreateInfo.get_anisotropyEnable(this.segment()); }
    /// Sets `anisotropyEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_anisotropyEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_anisotropyEnable.set(segment, 0L, index, value); }
    /// Sets `anisotropyEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_anisotropyEnable(MemorySegment segment, @CType("VkBool32") int value) { VkSamplerCreateInfo.set_anisotropyEnable(segment, 0L, value); }
    /// Sets `anisotropyEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo anisotropyEnable(@CType("VkBool32") int value) { VkSamplerCreateInfo.set_anisotropyEnable(this.segment(), value); return this; }

    /// {@return `maxAnisotropy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxAnisotropy(MemorySegment segment, long index) { return (float) VH_maxAnisotropy.get(segment, 0L, index); }
    /// {@return `maxAnisotropy`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxAnisotropy(MemorySegment segment) { return VkSamplerCreateInfo.get_maxAnisotropy(segment, 0L); }
    /// {@return `maxAnisotropy`}
    public @CType("float") float maxAnisotropy() { return VkSamplerCreateInfo.get_maxAnisotropy(this.segment()); }
    /// Sets `maxAnisotropy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxAnisotropy(MemorySegment segment, long index, @CType("float") float value) { VH_maxAnisotropy.set(segment, 0L, index, value); }
    /// Sets `maxAnisotropy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxAnisotropy(MemorySegment segment, @CType("float") float value) { VkSamplerCreateInfo.set_maxAnisotropy(segment, 0L, value); }
    /// Sets `maxAnisotropy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo maxAnisotropy(@CType("float") float value) { VkSamplerCreateInfo.set_maxAnisotropy(this.segment(), value); return this; }

    /// {@return `compareEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_compareEnable(MemorySegment segment, long index) { return (int) VH_compareEnable.get(segment, 0L, index); }
    /// {@return `compareEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_compareEnable(MemorySegment segment) { return VkSamplerCreateInfo.get_compareEnable(segment, 0L); }
    /// {@return `compareEnable`}
    public @CType("VkBool32") int compareEnable() { return VkSamplerCreateInfo.get_compareEnable(this.segment()); }
    /// Sets `compareEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compareEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_compareEnable.set(segment, 0L, index, value); }
    /// Sets `compareEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compareEnable(MemorySegment segment, @CType("VkBool32") int value) { VkSamplerCreateInfo.set_compareEnable(segment, 0L, value); }
    /// Sets `compareEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo compareEnable(@CType("VkBool32") int value) { VkSamplerCreateInfo.set_compareEnable(this.segment(), value); return this; }

    /// {@return `compareOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCompareOp") int get_compareOp(MemorySegment segment, long index) { return (int) VH_compareOp.get(segment, 0L, index); }
    /// {@return `compareOp`}
    /// @param segment the segment of the struct
    public static @CType("VkCompareOp") int get_compareOp(MemorySegment segment) { return VkSamplerCreateInfo.get_compareOp(segment, 0L); }
    /// {@return `compareOp`}
    public @CType("VkCompareOp") int compareOp() { return VkSamplerCreateInfo.get_compareOp(this.segment()); }
    /// Sets `compareOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compareOp(MemorySegment segment, long index, @CType("VkCompareOp") int value) { VH_compareOp.set(segment, 0L, index, value); }
    /// Sets `compareOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compareOp(MemorySegment segment, @CType("VkCompareOp") int value) { VkSamplerCreateInfo.set_compareOp(segment, 0L, value); }
    /// Sets `compareOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo compareOp(@CType("VkCompareOp") int value) { VkSamplerCreateInfo.set_compareOp(this.segment(), value); return this; }

    /// {@return `minLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minLod(MemorySegment segment, long index) { return (float) VH_minLod.get(segment, 0L, index); }
    /// {@return `minLod`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minLod(MemorySegment segment) { return VkSamplerCreateInfo.get_minLod(segment, 0L); }
    /// {@return `minLod`}
    public @CType("float") float minLod() { return VkSamplerCreateInfo.get_minLod(this.segment()); }
    /// Sets `minLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minLod(MemorySegment segment, long index, @CType("float") float value) { VH_minLod.set(segment, 0L, index, value); }
    /// Sets `minLod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minLod(MemorySegment segment, @CType("float") float value) { VkSamplerCreateInfo.set_minLod(segment, 0L, value); }
    /// Sets `minLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo minLod(@CType("float") float value) { VkSamplerCreateInfo.set_minLod(this.segment(), value); return this; }

    /// {@return `maxLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxLod(MemorySegment segment, long index) { return (float) VH_maxLod.get(segment, 0L, index); }
    /// {@return `maxLod`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxLod(MemorySegment segment) { return VkSamplerCreateInfo.get_maxLod(segment, 0L); }
    /// {@return `maxLod`}
    public @CType("float") float maxLod() { return VkSamplerCreateInfo.get_maxLod(this.segment()); }
    /// Sets `maxLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLod(MemorySegment segment, long index, @CType("float") float value) { VH_maxLod.set(segment, 0L, index, value); }
    /// Sets `maxLod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLod(MemorySegment segment, @CType("float") float value) { VkSamplerCreateInfo.set_maxLod(segment, 0L, value); }
    /// Sets `maxLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo maxLod(@CType("float") float value) { VkSamplerCreateInfo.set_maxLod(this.segment(), value); return this; }

    /// {@return `borderColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBorderColor") int get_borderColor(MemorySegment segment, long index) { return (int) VH_borderColor.get(segment, 0L, index); }
    /// {@return `borderColor`}
    /// @param segment the segment of the struct
    public static @CType("VkBorderColor") int get_borderColor(MemorySegment segment) { return VkSamplerCreateInfo.get_borderColor(segment, 0L); }
    /// {@return `borderColor`}
    public @CType("VkBorderColor") int borderColor() { return VkSamplerCreateInfo.get_borderColor(this.segment()); }
    /// Sets `borderColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_borderColor(MemorySegment segment, long index, @CType("VkBorderColor") int value) { VH_borderColor.set(segment, 0L, index, value); }
    /// Sets `borderColor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_borderColor(MemorySegment segment, @CType("VkBorderColor") int value) { VkSamplerCreateInfo.set_borderColor(segment, 0L, value); }
    /// Sets `borderColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo borderColor(@CType("VkBorderColor") int value) { VkSamplerCreateInfo.set_borderColor(this.segment(), value); return this; }

    /// {@return `unnormalizedCoordinates` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_unnormalizedCoordinates(MemorySegment segment, long index) { return (int) VH_unnormalizedCoordinates.get(segment, 0L, index); }
    /// {@return `unnormalizedCoordinates`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_unnormalizedCoordinates(MemorySegment segment) { return VkSamplerCreateInfo.get_unnormalizedCoordinates(segment, 0L); }
    /// {@return `unnormalizedCoordinates`}
    public @CType("VkBool32") int unnormalizedCoordinates() { return VkSamplerCreateInfo.get_unnormalizedCoordinates(this.segment()); }
    /// Sets `unnormalizedCoordinates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_unnormalizedCoordinates(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_unnormalizedCoordinates.set(segment, 0L, index, value); }
    /// Sets `unnormalizedCoordinates` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_unnormalizedCoordinates(MemorySegment segment, @CType("VkBool32") int value) { VkSamplerCreateInfo.set_unnormalizedCoordinates(segment, 0L, value); }
    /// Sets `unnormalizedCoordinates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCreateInfo unnormalizedCoordinates(@CType("VkBool32") int value) { VkSamplerCreateInfo.set_unnormalizedCoordinates(this.segment(), value); return this; }

    /// A buffer of [VkSamplerCreateInfo].
    public static final class Buffer extends VkSamplerCreateInfo {
        private final long elementCount;

        /// Creates `VkSamplerCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSamplerCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSamplerCreateInfo`
        public VkSamplerCreateInfo asSlice(long index) { return new VkSamplerCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSamplerCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSamplerCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSamplerCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSamplerCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkSamplerCreateFlags") int flagsAt(long index) { return VkSamplerCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkSamplerCreateFlags") int value) { VkSamplerCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `magFilter` at the given index}
        /// @param index the index
        public @CType("VkFilter") int magFilterAt(long index) { return VkSamplerCreateInfo.get_magFilter(this.segment(), index); }
        /// Sets `magFilter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer magFilterAt(long index, @CType("VkFilter") int value) { VkSamplerCreateInfo.set_magFilter(this.segment(), index, value); return this; }

        /// {@return `minFilter` at the given index}
        /// @param index the index
        public @CType("VkFilter") int minFilterAt(long index) { return VkSamplerCreateInfo.get_minFilter(this.segment(), index); }
        /// Sets `minFilter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minFilterAt(long index, @CType("VkFilter") int value) { VkSamplerCreateInfo.set_minFilter(this.segment(), index, value); return this; }

        /// {@return `mipmapMode` at the given index}
        /// @param index the index
        public @CType("VkSamplerMipmapMode") int mipmapModeAt(long index) { return VkSamplerCreateInfo.get_mipmapMode(this.segment(), index); }
        /// Sets `mipmapMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mipmapModeAt(long index, @CType("VkSamplerMipmapMode") int value) { VkSamplerCreateInfo.set_mipmapMode(this.segment(), index, value); return this; }

        /// {@return `addressModeU` at the given index}
        /// @param index the index
        public @CType("VkSamplerAddressMode") int addressModeUAt(long index) { return VkSamplerCreateInfo.get_addressModeU(this.segment(), index); }
        /// Sets `addressModeU` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer addressModeUAt(long index, @CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeU(this.segment(), index, value); return this; }

        /// {@return `addressModeV` at the given index}
        /// @param index the index
        public @CType("VkSamplerAddressMode") int addressModeVAt(long index) { return VkSamplerCreateInfo.get_addressModeV(this.segment(), index); }
        /// Sets `addressModeV` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer addressModeVAt(long index, @CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeV(this.segment(), index, value); return this; }

        /// {@return `addressModeW` at the given index}
        /// @param index the index
        public @CType("VkSamplerAddressMode") int addressModeWAt(long index) { return VkSamplerCreateInfo.get_addressModeW(this.segment(), index); }
        /// Sets `addressModeW` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer addressModeWAt(long index, @CType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.set_addressModeW(this.segment(), index, value); return this; }

        /// {@return `mipLodBias` at the given index}
        /// @param index the index
        public @CType("float") float mipLodBiasAt(long index) { return VkSamplerCreateInfo.get_mipLodBias(this.segment(), index); }
        /// Sets `mipLodBias` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mipLodBiasAt(long index, @CType("float") float value) { VkSamplerCreateInfo.set_mipLodBias(this.segment(), index, value); return this; }

        /// {@return `anisotropyEnable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int anisotropyEnableAt(long index) { return VkSamplerCreateInfo.get_anisotropyEnable(this.segment(), index); }
        /// Sets `anisotropyEnable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer anisotropyEnableAt(long index, @CType("VkBool32") int value) { VkSamplerCreateInfo.set_anisotropyEnable(this.segment(), index, value); return this; }

        /// {@return `maxAnisotropy` at the given index}
        /// @param index the index
        public @CType("float") float maxAnisotropyAt(long index) { return VkSamplerCreateInfo.get_maxAnisotropy(this.segment(), index); }
        /// Sets `maxAnisotropy` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxAnisotropyAt(long index, @CType("float") float value) { VkSamplerCreateInfo.set_maxAnisotropy(this.segment(), index, value); return this; }

        /// {@return `compareEnable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int compareEnableAt(long index) { return VkSamplerCreateInfo.get_compareEnable(this.segment(), index); }
        /// Sets `compareEnable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer compareEnableAt(long index, @CType("VkBool32") int value) { VkSamplerCreateInfo.set_compareEnable(this.segment(), index, value); return this; }

        /// {@return `compareOp` at the given index}
        /// @param index the index
        public @CType("VkCompareOp") int compareOpAt(long index) { return VkSamplerCreateInfo.get_compareOp(this.segment(), index); }
        /// Sets `compareOp` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer compareOpAt(long index, @CType("VkCompareOp") int value) { VkSamplerCreateInfo.set_compareOp(this.segment(), index, value); return this; }

        /// {@return `minLod` at the given index}
        /// @param index the index
        public @CType("float") float minLodAt(long index) { return VkSamplerCreateInfo.get_minLod(this.segment(), index); }
        /// Sets `minLod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minLodAt(long index, @CType("float") float value) { VkSamplerCreateInfo.set_minLod(this.segment(), index, value); return this; }

        /// {@return `maxLod` at the given index}
        /// @param index the index
        public @CType("float") float maxLodAt(long index) { return VkSamplerCreateInfo.get_maxLod(this.segment(), index); }
        /// Sets `maxLod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxLodAt(long index, @CType("float") float value) { VkSamplerCreateInfo.set_maxLod(this.segment(), index, value); return this; }

        /// {@return `borderColor` at the given index}
        /// @param index the index
        public @CType("VkBorderColor") int borderColorAt(long index) { return VkSamplerCreateInfo.get_borderColor(this.segment(), index); }
        /// Sets `borderColor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer borderColorAt(long index, @CType("VkBorderColor") int value) { VkSamplerCreateInfo.set_borderColor(this.segment(), index, value); return this; }

        /// {@return `unnormalizedCoordinates` at the given index}
        /// @param index the index
        public @CType("VkBool32") int unnormalizedCoordinatesAt(long index) { return VkSamplerCreateInfo.get_unnormalizedCoordinates(this.segment(), index); }
        /// Sets `unnormalizedCoordinates` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer unnormalizedCoordinatesAt(long index, @CType("VkBool32") int value) { VkSamplerCreateInfo.set_unnormalizedCoordinates(this.segment(), index, value); return this; }

    }
}
