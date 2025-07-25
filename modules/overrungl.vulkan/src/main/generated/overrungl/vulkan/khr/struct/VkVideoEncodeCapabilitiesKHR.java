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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeCapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeCapabilityFlagsKHR flags;
///     ((uint32_t) VkFlags) VkVideoEncodeRateControlModeFlagsKHR rateControlModes;
///     uint32_t maxRateControlLayers;
///     uint64_t maxBitrate;
///     uint32_t maxQualityLevels;
///     (struct VkExtent2D) VkExtent2D encodeInputPictureGranularity;
///     ((uint32_t) VkFlags) VkVideoEncodeFeedbackFlagsKHR supportedEncodeFeedbackFlags;
/// };
/// ```
public final class VkVideoEncodeCapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeCapabilitiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `rateControlModes`.
    public static final long OFFSET_rateControlModes = LAYOUT.byteOffset(PathElement.groupElement("rateControlModes"));
    /// The memory layout of `rateControlModes`.
    public static final MemoryLayout LAYOUT_rateControlModes = LAYOUT.select(PathElement.groupElement("rateControlModes"));
    /// The [VarHandle] of `rateControlModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rateControlModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlModes"));
    /// The byte offset of `maxRateControlLayers`.
    public static final long OFFSET_maxRateControlLayers = LAYOUT.byteOffset(PathElement.groupElement("maxRateControlLayers"));
    /// The memory layout of `maxRateControlLayers`.
    public static final MemoryLayout LAYOUT_maxRateControlLayers = LAYOUT.select(PathElement.groupElement("maxRateControlLayers"));
    /// The [VarHandle] of `maxRateControlLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxRateControlLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRateControlLayers"));
    /// The byte offset of `maxBitrate`.
    public static final long OFFSET_maxBitrate = LAYOUT.byteOffset(PathElement.groupElement("maxBitrate"));
    /// The memory layout of `maxBitrate`.
    public static final MemoryLayout LAYOUT_maxBitrate = LAYOUT.select(PathElement.groupElement("maxBitrate"));
    /// The [VarHandle] of `maxBitrate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxBitrate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBitrate"));
    /// The byte offset of `maxQualityLevels`.
    public static final long OFFSET_maxQualityLevels = LAYOUT.byteOffset(PathElement.groupElement("maxQualityLevels"));
    /// The memory layout of `maxQualityLevels`.
    public static final MemoryLayout LAYOUT_maxQualityLevels = LAYOUT.select(PathElement.groupElement("maxQualityLevels"));
    /// The [VarHandle] of `maxQualityLevels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxQualityLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQualityLevels"));
    /// The byte offset of `encodeInputPictureGranularity`.
    public static final long OFFSET_encodeInputPictureGranularity = LAYOUT.byteOffset(PathElement.groupElement("encodeInputPictureGranularity"));
    /// The memory layout of `encodeInputPictureGranularity`.
    public static final MemoryLayout LAYOUT_encodeInputPictureGranularity = LAYOUT.select(PathElement.groupElement("encodeInputPictureGranularity"));
    /// The byte offset of `supportedEncodeFeedbackFlags`.
    public static final long OFFSET_supportedEncodeFeedbackFlags = LAYOUT.byteOffset(PathElement.groupElement("supportedEncodeFeedbackFlags"));
    /// The memory layout of `supportedEncodeFeedbackFlags`.
    public static final MemoryLayout LAYOUT_supportedEncodeFeedbackFlags = LAYOUT.select(PathElement.groupElement("supportedEncodeFeedbackFlags"));
    /// The [VarHandle] of `supportedEncodeFeedbackFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedEncodeFeedbackFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedEncodeFeedbackFlags"));

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param rateControlModes `rateControlModes`
    /// @param maxRateControlLayers `maxRateControlLayers`
    /// @param maxBitrate `maxBitrate`
    /// @param maxQualityLevels `maxQualityLevels`
    /// @param encodeInputPictureGranularity `encodeInputPictureGranularity`
    /// @param supportedEncodeFeedbackFlags `supportedEncodeFeedbackFlags`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int rateControlModes, int maxRateControlLayers, long maxBitrate, int maxQualityLevels, MemorySegment encodeInputPictureGranularity, int supportedEncodeFeedbackFlags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).rateControlModes(rateControlModes).maxRateControlLayers(maxRateControlLayers).maxBitrate(maxBitrate).maxQualityLevels(maxQualityLevels).encodeInputPictureGranularity(encodeInputPictureGranularity).supportedEncodeFeedbackFlags(supportedEncodeFeedbackFlags);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param rateControlModes `rateControlModes`
    /// @param maxRateControlLayers `maxRateControlLayers`
    /// @param maxBitrate `maxBitrate`
    /// @param maxQualityLevels `maxQualityLevels`
    /// @param encodeInputPictureGranularity `encodeInputPictureGranularity`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int rateControlModes, int maxRateControlLayers, long maxBitrate, int maxQualityLevels, MemorySegment encodeInputPictureGranularity) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).rateControlModes(rateControlModes).maxRateControlLayers(maxRateControlLayers).maxBitrate(maxBitrate).maxQualityLevels(maxQualityLevels).encodeInputPictureGranularity(encodeInputPictureGranularity);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param rateControlModes `rateControlModes`
    /// @param maxRateControlLayers `maxRateControlLayers`
    /// @param maxBitrate `maxBitrate`
    /// @param maxQualityLevels `maxQualityLevels`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int rateControlModes, int maxRateControlLayers, long maxBitrate, int maxQualityLevels) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).rateControlModes(rateControlModes).maxRateControlLayers(maxRateControlLayers).maxBitrate(maxBitrate).maxQualityLevels(maxQualityLevels);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param rateControlModes `rateControlModes`
    /// @param maxRateControlLayers `maxRateControlLayers`
    /// @param maxBitrate `maxBitrate`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int rateControlModes, int maxRateControlLayers, long maxBitrate) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).rateControlModes(rateControlModes).maxRateControlLayers(maxRateControlLayers).maxBitrate(maxBitrate);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param rateControlModes `rateControlModes`
    /// @param maxRateControlLayers `maxRateControlLayers`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int rateControlModes, int maxRateControlLayers) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).rateControlModes(rateControlModes).maxRateControlLayers(maxRateControlLayers);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param rateControlModes `rateControlModes`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int rateControlModes) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).rateControlModes(rateControlModes);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeCapabilitiesKHR`
    public static VkVideoEncodeCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR copyFrom(VkVideoEncodeCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeCapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeCapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `rateControlModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rateControlModes(MemorySegment segment, long index) { return (int) VH_rateControlModes.get(segment, 0L, index); }
    /// {@return `rateControlModes`}
    public int rateControlModes() { return rateControlModes(this.segment(), 0L); }
    /// Sets `rateControlModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rateControlModes(MemorySegment segment, long index, int value) { VH_rateControlModes.set(segment, 0L, index, value); }
    /// Sets `rateControlModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR rateControlModes(int value) { rateControlModes(this.segment(), 0L, value); return this; }

    /// {@return `maxRateControlLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRateControlLayers(MemorySegment segment, long index) { return (int) VH_maxRateControlLayers.get(segment, 0L, index); }
    /// {@return `maxRateControlLayers`}
    public int maxRateControlLayers() { return maxRateControlLayers(this.segment(), 0L); }
    /// Sets `maxRateControlLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRateControlLayers(MemorySegment segment, long index, int value) { VH_maxRateControlLayers.set(segment, 0L, index, value); }
    /// Sets `maxRateControlLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxRateControlLayers(int value) { maxRateControlLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxBitrate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxBitrate(MemorySegment segment, long index) { return (long) VH_maxBitrate.get(segment, 0L, index); }
    /// {@return `maxBitrate`}
    public long maxBitrate() { return maxBitrate(this.segment(), 0L); }
    /// Sets `maxBitrate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBitrate(MemorySegment segment, long index, long value) { VH_maxBitrate.set(segment, 0L, index, value); }
    /// Sets `maxBitrate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxBitrate(long value) { maxBitrate(this.segment(), 0L, value); return this; }

    /// {@return `maxQualityLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxQualityLevels(MemorySegment segment, long index) { return (int) VH_maxQualityLevels.get(segment, 0L, index); }
    /// {@return `maxQualityLevels`}
    public int maxQualityLevels() { return maxQualityLevels(this.segment(), 0L); }
    /// Sets `maxQualityLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQualityLevels(MemorySegment segment, long index, int value) { VH_maxQualityLevels.set(segment, 0L, index, value); }
    /// Sets `maxQualityLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxQualityLevels(int value) { maxQualityLevels(this.segment(), 0L, value); return this; }

    /// {@return `encodeInputPictureGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment encodeInputPictureGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_encodeInputPictureGranularity, index), LAYOUT_encodeInputPictureGranularity); }
    /// {@return `encodeInputPictureGranularity`}
    public MemorySegment encodeInputPictureGranularity() { return encodeInputPictureGranularity(this.segment(), 0L); }
    /// Sets `encodeInputPictureGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void encodeInputPictureGranularity(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_encodeInputPictureGranularity, index), LAYOUT_encodeInputPictureGranularity.byteSize()); }
    /// Sets `encodeInputPictureGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity(MemorySegment value) { encodeInputPictureGranularity(this.segment(), 0L, value); return this; }
    /// Accepts `encodeInputPictureGranularity` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(encodeInputPictureGranularity())); return this; }

    /// {@return `supportedEncodeFeedbackFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedEncodeFeedbackFlags(MemorySegment segment, long index) { return (int) VH_supportedEncodeFeedbackFlags.get(segment, 0L, index); }
    /// {@return `supportedEncodeFeedbackFlags`}
    public int supportedEncodeFeedbackFlags() { return supportedEncodeFeedbackFlags(this.segment(), 0L); }
    /// Sets `supportedEncodeFeedbackFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedEncodeFeedbackFlags(MemorySegment segment, long index, int value) { VH_supportedEncodeFeedbackFlags.set(segment, 0L, index, value); }
    /// Sets `supportedEncodeFeedbackFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR supportedEncodeFeedbackFlags(int value) { supportedEncodeFeedbackFlags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeCapabilitiesKHR`
    public VkVideoEncodeCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeCapabilitiesKHR`
    public VkVideoEncodeCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeCapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR at(long index, Consumer<VkVideoEncodeCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `rateControlModes` at the given index}
    /// @param index the index of the struct buffer
    public int rateControlModesAt(long index) { return rateControlModes(this.segment(), index); }
    /// Sets `rateControlModes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR rateControlModesAt(long index, int value) { rateControlModes(this.segment(), index, value); return this; }

    /// {@return `maxRateControlLayers` at the given index}
    /// @param index the index of the struct buffer
    public int maxRateControlLayersAt(long index) { return maxRateControlLayers(this.segment(), index); }
    /// Sets `maxRateControlLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxRateControlLayersAt(long index, int value) { maxRateControlLayers(this.segment(), index, value); return this; }

    /// {@return `maxBitrate` at the given index}
    /// @param index the index of the struct buffer
    public long maxBitrateAt(long index) { return maxBitrate(this.segment(), index); }
    /// Sets `maxBitrate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxBitrateAt(long index, long value) { maxBitrate(this.segment(), index, value); return this; }

    /// {@return `maxQualityLevels` at the given index}
    /// @param index the index of the struct buffer
    public int maxQualityLevelsAt(long index) { return maxQualityLevels(this.segment(), index); }
    /// Sets `maxQualityLevels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR maxQualityLevelsAt(long index, int value) { maxQualityLevels(this.segment(), index, value); return this; }

    /// {@return `encodeInputPictureGranularity` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment encodeInputPictureGranularityAt(long index) { return encodeInputPictureGranularity(this.segment(), index); }
    /// Sets `encodeInputPictureGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularityAt(long index, MemorySegment value) { encodeInputPictureGranularity(this.segment(), index, value); return this; }
    /// Accepts `encodeInputPictureGranularity` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularityAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(encodeInputPictureGranularityAt(index))); return this; }

    /// {@return `supportedEncodeFeedbackFlags` at the given index}
    /// @param index the index of the struct buffer
    public int supportedEncodeFeedbackFlagsAt(long index) { return supportedEncodeFeedbackFlags(this.segment(), index); }
    /// Sets `supportedEncodeFeedbackFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeCapabilitiesKHR supportedEncodeFeedbackFlagsAt(long index, int value) { supportedEncodeFeedbackFlags(this.segment(), index, value); return this; }

}
