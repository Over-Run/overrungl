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
/// ### bufferDeviceAddress
/// [VarHandle][#VH_bufferDeviceAddress] - [Getter][#bufferDeviceAddress()] - [Setter][#bufferDeviceAddress(int)]
/// ### bufferDeviceAddressCaptureReplay
/// [VarHandle][#VH_bufferDeviceAddressCaptureReplay] - [Getter][#bufferDeviceAddressCaptureReplay()] - [Setter][#bufferDeviceAddressCaptureReplay(int)]
/// ### bufferDeviceAddressMultiDevice
/// [VarHandle][#VH_bufferDeviceAddressMultiDevice] - [Getter][#bufferDeviceAddressMultiDevice()] - [Setter][#bufferDeviceAddressMultiDevice(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceBufferDeviceAddressFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 bufferDeviceAddress;
///     VkBool32 bufferDeviceAddressCaptureReplay;
///     VkBool32 bufferDeviceAddressMultiDevice;
/// } VkPhysicalDeviceBufferDeviceAddressFeatures;
/// ```
public final class VkPhysicalDeviceBufferDeviceAddressFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceBufferDeviceAddressFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `bufferDeviceAddress` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddress"));
    /// The [VarHandle] of `bufferDeviceAddressCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The [VarHandle] of `bufferDeviceAddressMultiDevice` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddressMultiDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceBufferDeviceAddressFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeatures(segment); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceBufferDeviceAddressFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBufferDeviceAddressFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBufferDeviceAddressFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceBufferDeviceAddressFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBufferDeviceAddressFeatures`
    public static VkPhysicalDeviceBufferDeviceAddressFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBufferDeviceAddressFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceBufferDeviceAddressFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBufferDeviceAddressFeatures`
    public static VkPhysicalDeviceBufferDeviceAddressFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBufferDeviceAddressFeatures(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceBufferDeviceAddressFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceBufferDeviceAddressFeatures`
    public VkPhysicalDeviceBufferDeviceAddressFeatures asSlice(long index) { return new VkPhysicalDeviceBufferDeviceAddressFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceBufferDeviceAddressFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceBufferDeviceAddressFeatures`
    public VkPhysicalDeviceBufferDeviceAddressFeatures asSlice(long index, long count) { return new VkPhysicalDeviceBufferDeviceAddressFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddress(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddress.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddress(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddress(segment, 0L); }
    /// {@return `bufferDeviceAddress` at the given index}
    /// @param index the index
    public @CType("VkBool32") int bufferDeviceAddressAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddress(this.segment(), index); }
    /// {@return `bufferDeviceAddress`}
    public @CType("VkBool32") int bufferDeviceAddress() { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddress(this.segment()); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddress(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddress.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddress(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddress(segment, 0L, value); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddress(this.segment(), index, value); return this; }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddress(@CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddress(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddressCaptureReplay(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressCaptureReplay.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddressCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddressCaptureReplay(segment, 0L); }
    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param index the index
    public @CType("VkBool32") int bufferDeviceAddressCaptureReplayAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddressCaptureReplay(this.segment(), index); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    public @CType("VkBool32") int bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddressCaptureReplay(this.segment()); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddressCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddressCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddressCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddressCaptureReplay(segment, 0L, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddressCaptureReplay(this.segment(), index, value); return this; }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddressCaptureReplay(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddressMultiDevice(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressMultiDevice.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddressMultiDevice(MemorySegment segment) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddressMultiDevice(segment, 0L); }
    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param index the index
    public @CType("VkBool32") int bufferDeviceAddressMultiDeviceAt(long index) { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddressMultiDevice(this.segment(), index); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    public @CType("VkBool32") int bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceBufferDeviceAddressFeatures.get_bufferDeviceAddressMultiDevice(this.segment()); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddressMultiDevice(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddressMultiDevice.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddressMultiDevice(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddressMultiDevice(segment, 0L, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressMultiDeviceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddressMultiDevice(this.segment(), index, value); return this; }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressMultiDevice(@CType("VkBool32") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.set_bufferDeviceAddressMultiDevice(this.segment(), value); return this; }

}
