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
package overrungl.vulkan.qcom.struct;

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
/// ### maxBlockMatchWindow
/// [Byte offset][#OFFSET_maxBlockMatchWindow] - [Memory layout][#ML_maxBlockMatchWindow] - [Getter][#maxBlockMatchWindow()] - [Setter][#maxBlockMatchWindow(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImageProcessing2PropertiesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D maxBlockMatchWindow;
/// } VkPhysicalDeviceImageProcessing2PropertiesQCOM;
/// ```
public final class VkPhysicalDeviceImageProcessing2PropertiesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBlockMatchWindow")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `maxBlockMatchWindow`.
    public static final long OFFSET_maxBlockMatchWindow = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchWindow"));
    /// The memory layout of `maxBlockMatchWindow`.
    public static final MemoryLayout ML_maxBlockMatchWindow = LAYOUT.select(PathElement.groupElement("maxBlockMatchWindow"));

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment); }

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `maxBlockMatchWindow` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxBlockMatchWindow(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxBlockMatchWindow, index), ML_maxBlockMatchWindow); }
    /// {@return `maxBlockMatchWindow`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxBlockMatchWindow(MemorySegment segment) { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_maxBlockMatchWindow(segment, 0L); }
    /// {@return `maxBlockMatchWindow` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBlockMatchWindowAt(long index) { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_maxBlockMatchWindow(this.segment(), index); }
    /// {@return `maxBlockMatchWindow`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxBlockMatchWindow() { return VkPhysicalDeviceImageProcessing2PropertiesQCOM.get_maxBlockMatchWindow(this.segment()); }
    /// Sets `maxBlockMatchWindow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBlockMatchWindow(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxBlockMatchWindow, index), ML_maxBlockMatchWindow.byteSize()); }
    /// Sets `maxBlockMatchWindow` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBlockMatchWindow(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_maxBlockMatchWindow(segment, 0L, value); }
    /// Sets `maxBlockMatchWindow` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindowAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_maxBlockMatchWindow(this.segment(), index, value); return this; }
    /// Sets `maxBlockMatchWindow` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageProcessing2PropertiesQCOM.set_maxBlockMatchWindow(this.segment(), value); return this; }

}
