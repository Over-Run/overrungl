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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### sciSyncFence
/// [VarHandle][#VH_sciSyncFence] - [Getter][#sciSyncFence()] - [Setter][#sciSyncFence(int)]
/// ### sciSyncSemaphore2
/// [VarHandle][#VH_sciSyncSemaphore2] - [Getter][#sciSyncSemaphore2()] - [Setter][#sciSyncSemaphore2(int)]
/// ### sciSyncImport
/// [VarHandle][#VH_sciSyncImport] - [Getter][#sciSyncImport()] - [Setter][#sciSyncImport(int)]
/// ### sciSyncExport
/// [VarHandle][#VH_sciSyncExport] - [Getter][#sciSyncExport()] - [Setter][#sciSyncExport(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceExternalSciSync2FeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 sciSyncFence;
///     VkBool32 sciSyncSemaphore2;
///     VkBool32 sciSyncImport;
///     VkBool32 sciSyncExport;
/// } VkPhysicalDeviceExternalSciSync2FeaturesNV;
/// ```
public final class VkPhysicalDeviceExternalSciSync2FeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceExternalSciSync2FeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciSyncFence"),
        ValueLayout.JAVA_INT.withName("sciSyncSemaphore2"),
        ValueLayout.JAVA_INT.withName("sciSyncImport"),
        ValueLayout.JAVA_INT.withName("sciSyncExport")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sciSyncFence` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncFence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncFence"));
    /// The [VarHandle] of `sciSyncSemaphore2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncSemaphore2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncSemaphore2"));
    /// The [VarHandle] of `sciSyncImport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncImport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncImport"));
    /// The [VarHandle] of `sciSyncExport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncExport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncExport"));

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExternalSciSync2FeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSync2FeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSync2FeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSync2FeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSync2FeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSync2FeaturesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSync2FeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalSciSync2FeaturesNV`
    public static VkPhysicalDeviceExternalSciSync2FeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalSciSync2FeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalSciSync2FeaturesNV`
    public static VkPhysicalDeviceExternalSciSync2FeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalSciSync2FeaturesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalSciSync2FeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExternalSciSync2FeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `sciSyncFence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncFence(MemorySegment segment, long index) { return (int) VH_sciSyncFence.get(segment, 0L, index); }
    /// {@return `sciSyncFence`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncFence(MemorySegment segment) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncFence(segment, 0L); }
    /// {@return `sciSyncFence` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sciSyncFenceAt(long index) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncFence(this.segment(), index); }
    /// {@return `sciSyncFence`}
    public @CType("VkBool32") int sciSyncFence() { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncFence(this.segment()); }
    /// Sets `sciSyncFence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncFence(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncFence.set(segment, 0L, index, value); }
    /// Sets `sciSyncFence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncFence(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncFence(segment, 0L, value); }
    /// Sets `sciSyncFence` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncFenceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncFence(this.segment(), index, value); return this; }
    /// Sets `sciSyncFence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncFence(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncFence(this.segment(), value); return this; }

    /// {@return `sciSyncSemaphore2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncSemaphore2(MemorySegment segment, long index) { return (int) VH_sciSyncSemaphore2.get(segment, 0L, index); }
    /// {@return `sciSyncSemaphore2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncSemaphore2(MemorySegment segment) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncSemaphore2(segment, 0L); }
    /// {@return `sciSyncSemaphore2` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sciSyncSemaphore2At(long index) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncSemaphore2(this.segment(), index); }
    /// {@return `sciSyncSemaphore2`}
    public @CType("VkBool32") int sciSyncSemaphore2() { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncSemaphore2(this.segment()); }
    /// Sets `sciSyncSemaphore2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncSemaphore2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncSemaphore2.set(segment, 0L, index, value); }
    /// Sets `sciSyncSemaphore2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncSemaphore2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncSemaphore2(segment, 0L, value); }
    /// Sets `sciSyncSemaphore2` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncSemaphore2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncSemaphore2(this.segment(), index, value); return this; }
    /// Sets `sciSyncSemaphore2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncSemaphore2(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncSemaphore2(this.segment(), value); return this; }

    /// {@return `sciSyncImport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncImport(MemorySegment segment, long index) { return (int) VH_sciSyncImport.get(segment, 0L, index); }
    /// {@return `sciSyncImport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncImport(MemorySegment segment) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncImport(segment, 0L); }
    /// {@return `sciSyncImport` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sciSyncImportAt(long index) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncImport(this.segment(), index); }
    /// {@return `sciSyncImport`}
    public @CType("VkBool32") int sciSyncImport() { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncImport(this.segment()); }
    /// Sets `sciSyncImport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncImport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncImport.set(segment, 0L, index, value); }
    /// Sets `sciSyncImport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncImport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncImport(segment, 0L, value); }
    /// Sets `sciSyncImport` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncImportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncImport(this.segment(), index, value); return this; }
    /// Sets `sciSyncImport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncImport(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncImport(this.segment(), value); return this; }

    /// {@return `sciSyncExport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncExport(MemorySegment segment, long index) { return (int) VH_sciSyncExport.get(segment, 0L, index); }
    /// {@return `sciSyncExport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncExport(MemorySegment segment) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncExport(segment, 0L); }
    /// {@return `sciSyncExport` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sciSyncExportAt(long index) { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncExport(this.segment(), index); }
    /// {@return `sciSyncExport`}
    public @CType("VkBool32") int sciSyncExport() { return VkPhysicalDeviceExternalSciSync2FeaturesNV.get_sciSyncExport(this.segment()); }
    /// Sets `sciSyncExport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncExport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncExport.set(segment, 0L, index, value); }
    /// Sets `sciSyncExport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncExport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncExport(segment, 0L, value); }
    /// Sets `sciSyncExport` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncExportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncExport(this.segment(), index, value); return this; }
    /// Sets `sciSyncExport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncExport(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSync2FeaturesNV.set_sciSyncExport(this.segment(), value); return this; }

}
