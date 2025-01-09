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
/// ### supportedOutputGridSizes
/// [VarHandle][#VH_supportedOutputGridSizes] - [Getter][#supportedOutputGridSizes()] - [Setter][#supportedOutputGridSizes(int)]
/// ### supportedHintGridSizes
/// [VarHandle][#VH_supportedHintGridSizes] - [Getter][#supportedHintGridSizes()] - [Setter][#supportedHintGridSizes(int)]
/// ### hintSupported
/// [VarHandle][#VH_hintSupported] - [Getter][#hintSupported()] - [Setter][#hintSupported(int)]
/// ### costSupported
/// [VarHandle][#VH_costSupported] - [Getter][#costSupported()] - [Setter][#costSupported(int)]
/// ### bidirectionalFlowSupported
/// [VarHandle][#VH_bidirectionalFlowSupported] - [Getter][#bidirectionalFlowSupported()] - [Setter][#bidirectionalFlowSupported(int)]
/// ### globalFlowSupported
/// [VarHandle][#VH_globalFlowSupported] - [Getter][#globalFlowSupported()] - [Setter][#globalFlowSupported(int)]
/// ### minWidth
/// [VarHandle][#VH_minWidth] - [Getter][#minWidth()] - [Setter][#minWidth(int)]
/// ### minHeight
/// [VarHandle][#VH_minHeight] - [Getter][#minHeight()] - [Setter][#minHeight(int)]
/// ### maxWidth
/// [VarHandle][#VH_maxWidth] - [Getter][#maxWidth()] - [Setter][#maxWidth(int)]
/// ### maxHeight
/// [VarHandle][#VH_maxHeight] - [Getter][#maxHeight()] - [Setter][#maxHeight(int)]
/// ### maxNumRegionsOfInterest
/// [VarHandle][#VH_maxNumRegionsOfInterest] - [Getter][#maxNumRegionsOfInterest()] - [Setter][#maxNumRegionsOfInterest(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceOpticalFlowPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkOpticalFlowGridSizeFlagsNV supportedOutputGridSizes;
///     VkOpticalFlowGridSizeFlagsNV supportedHintGridSizes;
///     VkBool32 hintSupported;
///     VkBool32 costSupported;
///     VkBool32 bidirectionalFlowSupported;
///     VkBool32 globalFlowSupported;
///     uint32_t minWidth;
///     uint32_t minHeight;
///     uint32_t maxWidth;
///     uint32_t maxHeight;
///     uint32_t maxNumRegionsOfInterest;
/// } VkPhysicalDeviceOpticalFlowPropertiesNV;
/// ```
public final class VkPhysicalDeviceOpticalFlowPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceOpticalFlowPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedOutputGridSizes"),
        ValueLayout.JAVA_INT.withName("supportedHintGridSizes"),
        ValueLayout.JAVA_INT.withName("hintSupported"),
        ValueLayout.JAVA_INT.withName("costSupported"),
        ValueLayout.JAVA_INT.withName("bidirectionalFlowSupported"),
        ValueLayout.JAVA_INT.withName("globalFlowSupported"),
        ValueLayout.JAVA_INT.withName("minWidth"),
        ValueLayout.JAVA_INT.withName("minHeight"),
        ValueLayout.JAVA_INT.withName("maxWidth"),
        ValueLayout.JAVA_INT.withName("maxHeight"),
        ValueLayout.JAVA_INT.withName("maxNumRegionsOfInterest")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `supportedOutputGridSizes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedOutputGridSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedOutputGridSizes"));
    /// The [VarHandle] of `supportedHintGridSizes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedHintGridSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedHintGridSizes"));
    /// The [VarHandle] of `hintSupported` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hintSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hintSupported"));
    /// The [VarHandle] of `costSupported` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_costSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("costSupported"));
    /// The [VarHandle] of `bidirectionalFlowSupported` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bidirectionalFlowSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bidirectionalFlowSupported"));
    /// The [VarHandle] of `globalFlowSupported` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_globalFlowSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalFlowSupported"));
    /// The [VarHandle] of `minWidth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minWidth"));
    /// The [VarHandle] of `minHeight` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minHeight"));
    /// The [VarHandle] of `maxWidth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWidth"));
    /// The [VarHandle] of `maxHeight` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxHeight"));
    /// The [VarHandle] of `maxNumRegionsOfInterest` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxNumRegionsOfInterest = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxNumRegionsOfInterest"));

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceOpticalFlowPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public VkPhysicalDeviceOpticalFlowPropertiesNV asSlice(long index) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public VkPhysicalDeviceOpticalFlowPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `supportedOutputGridSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_supportedOutputGridSizes(MemorySegment segment, long index) { return (int) VH_supportedOutputGridSizes.get(segment, 0L, index); }
    /// {@return `supportedOutputGridSizes`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_supportedOutputGridSizes(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_supportedOutputGridSizes(segment, 0L); }
    /// {@return `supportedOutputGridSizes` at the given index}
    /// @param index the index
    public @CType("VkOpticalFlowGridSizeFlagsNV") int supportedOutputGridSizesAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_supportedOutputGridSizes(this.segment(), index); }
    /// {@return `supportedOutputGridSizes`}
    public @CType("VkOpticalFlowGridSizeFlagsNV") int supportedOutputGridSizes() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_supportedOutputGridSizes(this.segment()); }
    /// Sets `supportedOutputGridSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedOutputGridSizes(MemorySegment segment, long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VH_supportedOutputGridSizes.set(segment, 0L, index, value); }
    /// Sets `supportedOutputGridSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedOutputGridSizes(MemorySegment segment, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_supportedOutputGridSizes(segment, 0L, value); }
    /// Sets `supportedOutputGridSizes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedOutputGridSizesAt(long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_supportedOutputGridSizes(this.segment(), index, value); return this; }
    /// Sets `supportedOutputGridSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedOutputGridSizes(@CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_supportedOutputGridSizes(this.segment(), value); return this; }

    /// {@return `supportedHintGridSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_supportedHintGridSizes(MemorySegment segment, long index) { return (int) VH_supportedHintGridSizes.get(segment, 0L, index); }
    /// {@return `supportedHintGridSizes`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_supportedHintGridSizes(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_supportedHintGridSizes(segment, 0L); }
    /// {@return `supportedHintGridSizes` at the given index}
    /// @param index the index
    public @CType("VkOpticalFlowGridSizeFlagsNV") int supportedHintGridSizesAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_supportedHintGridSizes(this.segment(), index); }
    /// {@return `supportedHintGridSizes`}
    public @CType("VkOpticalFlowGridSizeFlagsNV") int supportedHintGridSizes() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_supportedHintGridSizes(this.segment()); }
    /// Sets `supportedHintGridSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedHintGridSizes(MemorySegment segment, long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VH_supportedHintGridSizes.set(segment, 0L, index, value); }
    /// Sets `supportedHintGridSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedHintGridSizes(MemorySegment segment, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_supportedHintGridSizes(segment, 0L, value); }
    /// Sets `supportedHintGridSizes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedHintGridSizesAt(long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_supportedHintGridSizes(this.segment(), index, value); return this; }
    /// Sets `supportedHintGridSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedHintGridSizes(@CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_supportedHintGridSizes(this.segment(), value); return this; }

    /// {@return `hintSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hintSupported(MemorySegment segment, long index) { return (int) VH_hintSupported.get(segment, 0L, index); }
    /// {@return `hintSupported`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hintSupported(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_hintSupported(segment, 0L); }
    /// {@return `hintSupported` at the given index}
    /// @param index the index
    public @CType("VkBool32") int hintSupportedAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_hintSupported(this.segment(), index); }
    /// {@return `hintSupported`}
    public @CType("VkBool32") int hintSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_hintSupported(this.segment()); }
    /// Sets `hintSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hintSupported(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hintSupported.set(segment, 0L, index, value); }
    /// Sets `hintSupported` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hintSupported(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_hintSupported(segment, 0L, value); }
    /// Sets `hintSupported` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV hintSupportedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_hintSupported(this.segment(), index, value); return this; }
    /// Sets `hintSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV hintSupported(@CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_hintSupported(this.segment(), value); return this; }

    /// {@return `costSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_costSupported(MemorySegment segment, long index) { return (int) VH_costSupported.get(segment, 0L, index); }
    /// {@return `costSupported`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_costSupported(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_costSupported(segment, 0L); }
    /// {@return `costSupported` at the given index}
    /// @param index the index
    public @CType("VkBool32") int costSupportedAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_costSupported(this.segment(), index); }
    /// {@return `costSupported`}
    public @CType("VkBool32") int costSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_costSupported(this.segment()); }
    /// Sets `costSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_costSupported(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_costSupported.set(segment, 0L, index, value); }
    /// Sets `costSupported` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_costSupported(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_costSupported(segment, 0L, value); }
    /// Sets `costSupported` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV costSupportedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_costSupported(this.segment(), index, value); return this; }
    /// Sets `costSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV costSupported(@CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_costSupported(this.segment(), value); return this; }

    /// {@return `bidirectionalFlowSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bidirectionalFlowSupported(MemorySegment segment, long index) { return (int) VH_bidirectionalFlowSupported.get(segment, 0L, index); }
    /// {@return `bidirectionalFlowSupported`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bidirectionalFlowSupported(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_bidirectionalFlowSupported(segment, 0L); }
    /// {@return `bidirectionalFlowSupported` at the given index}
    /// @param index the index
    public @CType("VkBool32") int bidirectionalFlowSupportedAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_bidirectionalFlowSupported(this.segment(), index); }
    /// {@return `bidirectionalFlowSupported`}
    public @CType("VkBool32") int bidirectionalFlowSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_bidirectionalFlowSupported(this.segment()); }
    /// Sets `bidirectionalFlowSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bidirectionalFlowSupported(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bidirectionalFlowSupported.set(segment, 0L, index, value); }
    /// Sets `bidirectionalFlowSupported` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bidirectionalFlowSupported(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_bidirectionalFlowSupported(segment, 0L, value); }
    /// Sets `bidirectionalFlowSupported` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV bidirectionalFlowSupportedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_bidirectionalFlowSupported(this.segment(), index, value); return this; }
    /// Sets `bidirectionalFlowSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV bidirectionalFlowSupported(@CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_bidirectionalFlowSupported(this.segment(), value); return this; }

    /// {@return `globalFlowSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_globalFlowSupported(MemorySegment segment, long index) { return (int) VH_globalFlowSupported.get(segment, 0L, index); }
    /// {@return `globalFlowSupported`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_globalFlowSupported(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_globalFlowSupported(segment, 0L); }
    /// {@return `globalFlowSupported` at the given index}
    /// @param index the index
    public @CType("VkBool32") int globalFlowSupportedAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_globalFlowSupported(this.segment(), index); }
    /// {@return `globalFlowSupported`}
    public @CType("VkBool32") int globalFlowSupported() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_globalFlowSupported(this.segment()); }
    /// Sets `globalFlowSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_globalFlowSupported(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_globalFlowSupported.set(segment, 0L, index, value); }
    /// Sets `globalFlowSupported` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_globalFlowSupported(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_globalFlowSupported(segment, 0L, value); }
    /// Sets `globalFlowSupported` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV globalFlowSupportedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_globalFlowSupported(this.segment(), index, value); return this; }
    /// Sets `globalFlowSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV globalFlowSupported(@CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_globalFlowSupported(this.segment(), value); return this; }

    /// {@return `minWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minWidth(MemorySegment segment, long index) { return (int) VH_minWidth.get(segment, 0L, index); }
    /// {@return `minWidth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minWidth(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_minWidth(segment, 0L); }
    /// {@return `minWidth` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minWidthAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_minWidth(this.segment(), index); }
    /// {@return `minWidth`}
    public @CType("uint32_t") int minWidth() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_minWidth(this.segment()); }
    /// Sets `minWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minWidth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minWidth.set(segment, 0L, index, value); }
    /// Sets `minWidth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minWidth(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_minWidth(segment, 0L, value); }
    /// Sets `minWidth` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minWidthAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_minWidth(this.segment(), index, value); return this; }
    /// Sets `minWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minWidth(@CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_minWidth(this.segment(), value); return this; }

    /// {@return `minHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minHeight(MemorySegment segment, long index) { return (int) VH_minHeight.get(segment, 0L, index); }
    /// {@return `minHeight`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minHeight(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_minHeight(segment, 0L); }
    /// {@return `minHeight` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minHeightAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_minHeight(this.segment(), index); }
    /// {@return `minHeight`}
    public @CType("uint32_t") int minHeight() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_minHeight(this.segment()); }
    /// Sets `minHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minHeight(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minHeight.set(segment, 0L, index, value); }
    /// Sets `minHeight` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minHeight(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_minHeight(segment, 0L, value); }
    /// Sets `minHeight` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minHeightAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_minHeight(this.segment(), index, value); return this; }
    /// Sets `minHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minHeight(@CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_minHeight(this.segment(), value); return this; }

    /// {@return `maxWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxWidth(MemorySegment segment, long index) { return (int) VH_maxWidth.get(segment, 0L, index); }
    /// {@return `maxWidth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxWidth(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxWidth(segment, 0L); }
    /// {@return `maxWidth` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxWidthAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxWidth(this.segment(), index); }
    /// {@return `maxWidth`}
    public @CType("uint32_t") int maxWidth() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxWidth(this.segment()); }
    /// Sets `maxWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxWidth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxWidth.set(segment, 0L, index, value); }
    /// Sets `maxWidth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxWidth(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxWidth(segment, 0L, value); }
    /// Sets `maxWidth` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxWidthAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxWidth(this.segment(), index, value); return this; }
    /// Sets `maxWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxWidth(@CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxWidth(this.segment(), value); return this; }

    /// {@return `maxHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxHeight(MemorySegment segment, long index) { return (int) VH_maxHeight.get(segment, 0L, index); }
    /// {@return `maxHeight`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxHeight(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxHeight(segment, 0L); }
    /// {@return `maxHeight` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxHeightAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxHeight(this.segment(), index); }
    /// {@return `maxHeight`}
    public @CType("uint32_t") int maxHeight() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxHeight(this.segment()); }
    /// Sets `maxHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxHeight(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxHeight.set(segment, 0L, index, value); }
    /// Sets `maxHeight` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxHeight(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxHeight(segment, 0L, value); }
    /// Sets `maxHeight` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxHeightAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxHeight(this.segment(), index, value); return this; }
    /// Sets `maxHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxHeight(@CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxHeight(this.segment(), value); return this; }

    /// {@return `maxNumRegionsOfInterest` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxNumRegionsOfInterest(MemorySegment segment, long index) { return (int) VH_maxNumRegionsOfInterest.get(segment, 0L, index); }
    /// {@return `maxNumRegionsOfInterest`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxNumRegionsOfInterest(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxNumRegionsOfInterest(segment, 0L); }
    /// {@return `maxNumRegionsOfInterest` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxNumRegionsOfInterestAt(long index) { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxNumRegionsOfInterest(this.segment(), index); }
    /// {@return `maxNumRegionsOfInterest`}
    public @CType("uint32_t") int maxNumRegionsOfInterest() { return VkPhysicalDeviceOpticalFlowPropertiesNV.get_maxNumRegionsOfInterest(this.segment()); }
    /// Sets `maxNumRegionsOfInterest` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxNumRegionsOfInterest(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxNumRegionsOfInterest.set(segment, 0L, index, value); }
    /// Sets `maxNumRegionsOfInterest` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxNumRegionsOfInterest(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxNumRegionsOfInterest(segment, 0L, value); }
    /// Sets `maxNumRegionsOfInterest` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxNumRegionsOfInterestAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxNumRegionsOfInterest(this.segment(), index, value); return this; }
    /// Sets `maxNumRegionsOfInterest` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxNumRegionsOfInterest(@CType("uint32_t") int value) { VkPhysicalDeviceOpticalFlowPropertiesNV.set_maxNumRegionsOfInterest(this.segment(), value); return this; }

}
