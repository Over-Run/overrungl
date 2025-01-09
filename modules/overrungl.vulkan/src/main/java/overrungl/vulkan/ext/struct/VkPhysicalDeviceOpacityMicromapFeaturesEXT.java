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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### micromap
/// [VarHandle][#VH_micromap] - [Getter][#micromap()] - [Setter][#micromap(int)]
/// ### micromapCaptureReplay
/// [VarHandle][#VH_micromapCaptureReplay] - [Getter][#micromapCaptureReplay()] - [Setter][#micromapCaptureReplay(int)]
/// ### micromapHostCommands
/// [VarHandle][#VH_micromapHostCommands] - [Getter][#micromapHostCommands()] - [Setter][#micromapHostCommands(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceOpacityMicromapFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 micromap;
///     VkBool32 micromapCaptureReplay;
///     VkBool32 micromapHostCommands;
/// } VkPhysicalDeviceOpacityMicromapFeaturesEXT;
/// ```
public final class VkPhysicalDeviceOpacityMicromapFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("micromap"),
        ValueLayout.JAVA_INT.withName("micromapCaptureReplay"),
        ValueLayout.JAVA_INT.withName("micromapHostCommands")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `micromap` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));
    /// The [VarHandle] of `micromapCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_micromapCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapCaptureReplay"));
    /// The [VarHandle] of `micromapHostCommands` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_micromapHostCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapHostCommands"));

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceOpacityMicromapFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceOpacityMicromapFeaturesEXT`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `micromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_micromap(MemorySegment segment, long index) { return (int) VH_micromap.get(segment, 0L, index); }
    /// {@return `micromap`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_micromap(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromap(segment, 0L); }
    /// {@return `micromap` at the given index}
    /// @param index the index
    public @CType("VkBool32") int micromapAt(long index) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromap(this.segment(), index); }
    /// {@return `micromap`}
    public @CType("VkBool32") int micromap() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromap(this.segment()); }
    /// Sets `micromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_micromap(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_micromap.set(segment, 0L, index, value); }
    /// Sets `micromap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_micromap(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromap(segment, 0L, value); }
    /// Sets `micromap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromap(this.segment(), index, value); return this; }
    /// Sets `micromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromap(@CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromap(this.segment(), value); return this; }

    /// {@return `micromapCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_micromapCaptureReplay(MemorySegment segment, long index) { return (int) VH_micromapCaptureReplay.get(segment, 0L, index); }
    /// {@return `micromapCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_micromapCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromapCaptureReplay(segment, 0L); }
    /// {@return `micromapCaptureReplay` at the given index}
    /// @param index the index
    public @CType("VkBool32") int micromapCaptureReplayAt(long index) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromapCaptureReplay(this.segment(), index); }
    /// {@return `micromapCaptureReplay`}
    public @CType("VkBool32") int micromapCaptureReplay() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromapCaptureReplay(this.segment()); }
    /// Sets `micromapCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_micromapCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_micromapCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `micromapCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_micromapCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromapCaptureReplay(segment, 0L, value); }
    /// Sets `micromapCaptureReplay` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromapCaptureReplay(this.segment(), index, value); return this; }
    /// Sets `micromapCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromapCaptureReplay(this.segment(), value); return this; }

    /// {@return `micromapHostCommands` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_micromapHostCommands(MemorySegment segment, long index) { return (int) VH_micromapHostCommands.get(segment, 0L, index); }
    /// {@return `micromapHostCommands`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_micromapHostCommands(MemorySegment segment) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromapHostCommands(segment, 0L); }
    /// {@return `micromapHostCommands` at the given index}
    /// @param index the index
    public @CType("VkBool32") int micromapHostCommandsAt(long index) { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromapHostCommands(this.segment(), index); }
    /// {@return `micromapHostCommands`}
    public @CType("VkBool32") int micromapHostCommands() { return VkPhysicalDeviceOpacityMicromapFeaturesEXT.get_micromapHostCommands(this.segment()); }
    /// Sets `micromapHostCommands` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_micromapHostCommands(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_micromapHostCommands.set(segment, 0L, index, value); }
    /// Sets `micromapHostCommands` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_micromapHostCommands(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromapHostCommands(segment, 0L, value); }
    /// Sets `micromapHostCommands` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommandsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromapHostCommands(this.segment(), index, value); return this; }
    /// Sets `micromapHostCommands` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommands(@CType("VkBool32") int value) { VkPhysicalDeviceOpacityMicromapFeaturesEXT.set_micromapHostCommands(this.segment(), value); return this; }

}
