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
package overrungl.vulkan.khr.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### rateControlModes
/// [VarHandle][#VH_rateControlModes] - [Getter][#rateControlModes()] - [Setter][#rateControlModes(int)]
/// ### maxRateControlLayers
/// [VarHandle][#VH_maxRateControlLayers] - [Getter][#maxRateControlLayers()] - [Setter][#maxRateControlLayers(int)]
/// ### maxBitrate
/// [VarHandle][#VH_maxBitrate] - [Getter][#maxBitrate()] - [Setter][#maxBitrate(long)]
/// ### maxQualityLevels
/// [VarHandle][#VH_maxQualityLevels] - [Getter][#maxQualityLevels()] - [Setter][#maxQualityLevels(int)]
/// ### encodeInputPictureGranularity
/// [Byte offset][#OFFSET_encodeInputPictureGranularity] - [Memory layout][#ML_encodeInputPictureGranularity] - [Getter][#encodeInputPictureGranularity()] - [Setter][#encodeInputPictureGranularity(java.lang.foreign.MemorySegment)]
/// ### supportedEncodeFeedbackFlags
/// [VarHandle][#VH_supportedEncodeFeedbackFlags] - [Getter][#supportedEncodeFeedbackFlags()] - [Setter][#supportedEncodeFeedbackFlags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeCapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeCapabilityFlagsKHR flags;
///     VkVideoEncodeRateControlModeFlagsKHR rateControlModes;
///     uint32_t maxRateControlLayers;
///     uint64_t maxBitrate;
///     uint32_t maxQualityLevels;
///     VkExtent2D encodeInputPictureGranularity;
///     VkVideoEncodeFeedbackFlagsKHR supportedEncodeFeedbackFlags;
/// } VkVideoEncodeCapabilitiesKHR;
/// ```
public final class VkVideoEncodeCapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rateControlModes"),
        ValueLayout.JAVA_INT.withName("maxRateControlLayers"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("maxQualityLevels"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("encodeInputPictureGranularity"),
        ValueLayout.JAVA_INT.withName("supportedEncodeFeedbackFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `rateControlModes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rateControlModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlModes"));
    /// The [VarHandle] of `maxRateControlLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRateControlLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRateControlLayers"));
    /// The [VarHandle] of `maxBitrate` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBitrate"));
    /// The [VarHandle] of `maxQualityLevels` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxQualityLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQualityLevels"));
    /// The byte offset of `encodeInputPictureGranularity`.
    public static final long OFFSET_encodeInputPictureGranularity = LAYOUT.byteOffset(PathElement.groupElement("encodeInputPictureGranularity"));
    /// The memory layout of `encodeInputPictureGranularity`.
    public static final MemoryLayout ML_encodeInputPictureGranularity = LAYOUT.select(PathElement.groupElement("encodeInputPictureGranularity"));
    /// The [VarHandle] of `supportedEncodeFeedbackFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedEncodeFeedbackFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedEncodeFeedbackFlags"));

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeCapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment); }

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeCapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeCapabilitiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeCapabilitiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeCapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeCapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeCapabilitiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeCapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeCapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeCapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeCapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeCapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeCapabilityFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeCapabilityFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeCapabilityFlagsKHR") int flagsAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeCapabilityFlagsKHR") int flags() { return VkVideoEncodeCapabilitiesKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeCapabilityFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeCapabilityFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR flagsAt(long index, @CType("VkVideoEncodeCapabilityFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR flags(@CType("VkVideoEncodeCapabilityFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_flags(this.segment(), value); return this; }

    /// {@return `rateControlModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeRateControlModeFlagsKHR") int get_rateControlModes(MemorySegment segment, long index) { return (int) VH_rateControlModes.get(segment, 0L, index); }
    /// {@return `rateControlModes`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeRateControlModeFlagsKHR") int get_rateControlModes(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_rateControlModes(segment, 0L); }
    /// {@return `rateControlModes` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeRateControlModeFlagsKHR") int rateControlModesAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_rateControlModes(this.segment(), index); }
    /// {@return `rateControlModes`}
    public @CType("VkVideoEncodeRateControlModeFlagsKHR") int rateControlModes() { return VkVideoEncodeCapabilitiesKHR.get_rateControlModes(this.segment()); }
    /// Sets `rateControlModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rateControlModes(MemorySegment segment, long index, @CType("VkVideoEncodeRateControlModeFlagsKHR") int value) { VH_rateControlModes.set(segment, 0L, index, value); }
    /// Sets `rateControlModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rateControlModes(MemorySegment segment, @CType("VkVideoEncodeRateControlModeFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_rateControlModes(segment, 0L, value); }
    /// Sets `rateControlModes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR rateControlModesAt(long index, @CType("VkVideoEncodeRateControlModeFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_rateControlModes(this.segment(), index, value); return this; }
    /// Sets `rateControlModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR rateControlModes(@CType("VkVideoEncodeRateControlModeFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_rateControlModes(this.segment(), value); return this; }

    /// {@return `maxRateControlLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRateControlLayers(MemorySegment segment, long index) { return (int) VH_maxRateControlLayers.get(segment, 0L, index); }
    /// {@return `maxRateControlLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRateControlLayers(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_maxRateControlLayers(segment, 0L); }
    /// {@return `maxRateControlLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxRateControlLayersAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_maxRateControlLayers(this.segment(), index); }
    /// {@return `maxRateControlLayers`}
    public @CType("uint32_t") int maxRateControlLayers() { return VkVideoEncodeCapabilitiesKHR.get_maxRateControlLayers(this.segment()); }
    /// Sets `maxRateControlLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRateControlLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRateControlLayers.set(segment, 0L, index, value); }
    /// Sets `maxRateControlLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRateControlLayers(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeCapabilitiesKHR.set_maxRateControlLayers(segment, 0L, value); }
    /// Sets `maxRateControlLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxRateControlLayersAt(long index, @CType("uint32_t") int value) { VkVideoEncodeCapabilitiesKHR.set_maxRateControlLayers(this.segment(), index, value); return this; }
    /// Sets `maxRateControlLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxRateControlLayers(@CType("uint32_t") int value) { VkVideoEncodeCapabilitiesKHR.set_maxRateControlLayers(this.segment(), value); return this; }

    /// {@return `maxBitrate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_maxBitrate(MemorySegment segment, long index) { return (long) VH_maxBitrate.get(segment, 0L, index); }
    /// {@return `maxBitrate`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_maxBitrate(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_maxBitrate(segment, 0L); }
    /// {@return `maxBitrate` at the given index}
    /// @param index the index
    public @CType("uint64_t") long maxBitrateAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_maxBitrate(this.segment(), index); }
    /// {@return `maxBitrate`}
    public @CType("uint64_t") long maxBitrate() { return VkVideoEncodeCapabilitiesKHR.get_maxBitrate(this.segment()); }
    /// Sets `maxBitrate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBitrate(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_maxBitrate.set(segment, 0L, index, value); }
    /// Sets `maxBitrate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBitrate(MemorySegment segment, @CType("uint64_t") long value) { VkVideoEncodeCapabilitiesKHR.set_maxBitrate(segment, 0L, value); }
    /// Sets `maxBitrate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxBitrateAt(long index, @CType("uint64_t") long value) { VkVideoEncodeCapabilitiesKHR.set_maxBitrate(this.segment(), index, value); return this; }
    /// Sets `maxBitrate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxBitrate(@CType("uint64_t") long value) { VkVideoEncodeCapabilitiesKHR.set_maxBitrate(this.segment(), value); return this; }

    /// {@return `maxQualityLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxQualityLevels(MemorySegment segment, long index) { return (int) VH_maxQualityLevels.get(segment, 0L, index); }
    /// {@return `maxQualityLevels`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxQualityLevels(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_maxQualityLevels(segment, 0L); }
    /// {@return `maxQualityLevels` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxQualityLevelsAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_maxQualityLevels(this.segment(), index); }
    /// {@return `maxQualityLevels`}
    public @CType("uint32_t") int maxQualityLevels() { return VkVideoEncodeCapabilitiesKHR.get_maxQualityLevels(this.segment()); }
    /// Sets `maxQualityLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQualityLevels(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxQualityLevels.set(segment, 0L, index, value); }
    /// Sets `maxQualityLevels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQualityLevels(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeCapabilitiesKHR.set_maxQualityLevels(segment, 0L, value); }
    /// Sets `maxQualityLevels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxQualityLevelsAt(long index, @CType("uint32_t") int value) { VkVideoEncodeCapabilitiesKHR.set_maxQualityLevels(this.segment(), index, value); return this; }
    /// Sets `maxQualityLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxQualityLevels(@CType("uint32_t") int value) { VkVideoEncodeCapabilitiesKHR.set_maxQualityLevels(this.segment(), value); return this; }

    /// {@return `encodeInputPictureGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_encodeInputPictureGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_encodeInputPictureGranularity, index), ML_encodeInputPictureGranularity); }
    /// {@return `encodeInputPictureGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_encodeInputPictureGranularity(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_encodeInputPictureGranularity(segment, 0L); }
    /// {@return `encodeInputPictureGranularity` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment encodeInputPictureGranularityAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_encodeInputPictureGranularity(this.segment(), index); }
    /// {@return `encodeInputPictureGranularity`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment encodeInputPictureGranularity() { return VkVideoEncodeCapabilitiesKHR.get_encodeInputPictureGranularity(this.segment()); }
    /// Sets `encodeInputPictureGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_encodeInputPictureGranularity(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_encodeInputPictureGranularity, index), ML_encodeInputPictureGranularity.byteSize()); }
    /// Sets `encodeInputPictureGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_encodeInputPictureGranularity(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeCapabilitiesKHR.set_encodeInputPictureGranularity(segment, 0L, value); }
    /// Sets `encodeInputPictureGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularityAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeCapabilitiesKHR.set_encodeInputPictureGranularity(this.segment(), index, value); return this; }
    /// Sets `encodeInputPictureGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeCapabilitiesKHR.set_encodeInputPictureGranularity(this.segment(), value); return this; }

    /// {@return `supportedEncodeFeedbackFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeFeedbackFlagsKHR") int get_supportedEncodeFeedbackFlags(MemorySegment segment, long index) { return (int) VH_supportedEncodeFeedbackFlags.get(segment, 0L, index); }
    /// {@return `supportedEncodeFeedbackFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeFeedbackFlagsKHR") int get_supportedEncodeFeedbackFlags(MemorySegment segment) { return VkVideoEncodeCapabilitiesKHR.get_supportedEncodeFeedbackFlags(segment, 0L); }
    /// {@return `supportedEncodeFeedbackFlags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeFeedbackFlagsKHR") int supportedEncodeFeedbackFlagsAt(long index) { return VkVideoEncodeCapabilitiesKHR.get_supportedEncodeFeedbackFlags(this.segment(), index); }
    /// {@return `supportedEncodeFeedbackFlags`}
    public @CType("VkVideoEncodeFeedbackFlagsKHR") int supportedEncodeFeedbackFlags() { return VkVideoEncodeCapabilitiesKHR.get_supportedEncodeFeedbackFlags(this.segment()); }
    /// Sets `supportedEncodeFeedbackFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedEncodeFeedbackFlags(MemorySegment segment, long index, @CType("VkVideoEncodeFeedbackFlagsKHR") int value) { VH_supportedEncodeFeedbackFlags.set(segment, 0L, index, value); }
    /// Sets `supportedEncodeFeedbackFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedEncodeFeedbackFlags(MemorySegment segment, @CType("VkVideoEncodeFeedbackFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_supportedEncodeFeedbackFlags(segment, 0L, value); }
    /// Sets `supportedEncodeFeedbackFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR supportedEncodeFeedbackFlagsAt(long index, @CType("VkVideoEncodeFeedbackFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_supportedEncodeFeedbackFlags(this.segment(), index, value); return this; }
    /// Sets `supportedEncodeFeedbackFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR supportedEncodeFeedbackFlags(@CType("VkVideoEncodeFeedbackFlagsKHR") int value) { VkVideoEncodeCapabilitiesKHR.set_supportedEncodeFeedbackFlags(this.segment(), value); return this; }

}
